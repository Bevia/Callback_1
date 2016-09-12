package com.company;

/**
 * Created by vincentbevia on 12/09/16.
 */
public class ClassA {

    //Using composition to talk to method in ClassC
    ClassC classC;

    /**
     * acting as "Callback"
     *
     * @param contractNeverChanges
     */
    public void register(ContractNeverChanges contractNeverChanges) {
        contractNeverChanges.printContractNeverChanges(" A");

    }

    public void callingClassC() {
        //Using composition to talk to Class C!
     /*   new ClassC().classCMethod();*/

        classC = new ClassC();
        classC.classCMethod();

    }
}
