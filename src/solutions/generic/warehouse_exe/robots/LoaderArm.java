package solutions.generic.warehouse_exe.robots;

import solutions.generic.warehouse_exe.containers.Crate;
import solutions.generic.warehouse_exe.products.ColdProduct;

public class LoaderArm {
    public static void loadCold(Crate<? super ColdProduct> crate, ColdProduct item) {
        crate.add(item);
        System.out.println("[Loader] added " + item + " to crate");
    }
}
