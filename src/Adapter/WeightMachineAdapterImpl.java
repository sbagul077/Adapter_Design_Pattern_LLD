package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    public double getWeightInKg(){
        double weightInPound = weightMachine.getWeightInPound();

        //convert it to KGs
        double weightInKg = weightInPound * 0.453592;
        return weightInKg;
    }
}
