package solutions.manage_plots.models;

import solutions.manage_plots.interfaces.MunicipalPayments;
import solutions.manage_plots.interfaces.Waterable;

public abstract class Residence extends Plot implements Waterable, MunicipalPayments {

    public static final int MUNICPAL_PAYMENT_PER_MR = 80;

    protected int numOfTenants;

    public Residence(double size, int numOfTenants)
    {
        super(size);
        this.numOfTenants = numOfTenants;
    }

    @Override
    public double getPayment() {
        return MUNICPAL_PAYMENT_PER_MR * sizeSqM;
    }

    @Override
    public int numOfUsedCubesOfWater() {
        return 150;// some number
    }

    @Override
    public String toString() {
        return super.toString() + ", num of tenants = " + numOfTenants;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other){
            return true;
        }
        if (other instanceof Residence residence) {
            return numOfTenants == residence.numOfTenants;
        }
         return false;
    }

}
