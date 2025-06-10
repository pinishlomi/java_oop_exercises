package solutions.generic.warehouse_exe;

import solutions.generic.warehouse_exe.containers.Crate;
import solutions.generic.warehouse_exe.products.*;
import solutions.generic.warehouse_exe.robots.InspectorArm;
import solutions.generic.warehouse_exe.robots.LoaderArm;


public class Main {
    public static void main(String[] args) {

        // Crate that accepts ANY Product (acts as <? super ColdProduct> too)
        Crate<Product> generalCrate = new Crate<>();
        generalCrate.add(new Book("Clean Code"));

        // Loader may add ColdProduct or any subtype
        LoaderArm.loadCold(generalCrate, new Milk());
        LoaderArm.loadCold(generalCrate, new FrozenPizza());

        // Crate dedicated only to ColdProduct hierarchy
        Crate<ColdProduct> coldCrate = new Crate<>();
        LoaderArm.loadCold(coldCrate, new Milk());
        LoaderArm.loadCold(coldCrate, new FrozenPizza());

        // ----- Reports -----
        InspectorArm.printReport(generalCrate);
        InspectorArm.printReport(coldCrate);

        // errors
        // LoaderArm.loadCold(coldCrate, new Book("Design Patterns"));  // ❌ Book is not ColdProduct
        // coldCrate.add(new Book("Effective Java"));                   // ❌ Book is not ColdProduct
        // Crate<? extends Product> readOnly = coldCrate;
        // readOnly.add(new Milk());                                    // ❌ Cannot add to extends
    }
}
/*
[Loader] added Milk to crate
[Loader] added FrozenPizza to crate
[Loader] added Milk to crate
[Loader] added FrozenPizza to crate
[Inspector] crate contains:
  • Clean Code
  • Milk
  • FrozenPizza
[Inspector] crate contains:
  • Milk
  • FrozenPizza
 */
