package solutions.generic.warehouse_exe.robots;

import solutions.generic.warehouse_exe.containers.Crate;
import solutions.generic.warehouse_exe.products.Product;

public class InspectorArm {
    public static void printReport(Crate<? extends Product> crate) {
        System.out.println("[Inspector] crate contains:");
        for (Product p : crate.getContents()) {
            System.out.println("  • " + p.getName());
        }
    }
}
