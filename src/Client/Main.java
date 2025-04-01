package Client;

import Adaptee.WeightMachineForBabies;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String args[]){
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
//        System.out.println(new DecimalFormat("$#.00").format(weightMachineAdapter.getWeightInKg()));
        System.out.format("Converted Weight from Pounds to KGs : %.2f", weightMachineAdapter.getWeightInKg());
    }
}
;