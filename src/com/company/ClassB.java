package com.company;

/**
 * Created by vincentbevia on 12/09/16.
 */
public class ClassB {

    /**
     * acting as "Callback"
     * @param contractNeverChanges
     */
    public void register (ContractNeverChanges contractNeverChanges)
    {
        contractNeverChanges.printContractNeverChanges(" B");
    }
}
