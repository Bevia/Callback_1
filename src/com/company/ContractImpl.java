package com.company;

/**
 * Created by vincentbevia on 12/09/16.
 */
public class ContractImpl implements Contract, ContractNeverChanges {

    private String helloThere = "Hello, I've called you from";

    /**
     *
     *  this is the contract that never ever changes!!!!:)
     *
     */

    @Override
    public void printContractNeverChanges(String theCallerClass) {
        //Now this is the only thing ever changes ------> the method name or implementation!!!
        //Follow whatever changes from the bottom!
        printSomethingElseElse(theCallerClass);
        printSomething(theCallerClass);
    }

    /**
     *
     *     Now, the following can change....why not?
     *
     * @param theCallerClass
     */

    @Override
    public void printSomething(String theCallerClass) {
        System.out.println("OK, call me too, go ahead " + theCallerClass);

    }

    //now here you can do all the changes you may want...don't matter any more!!!
    @Override
    public void printSomethingElseElse(String theCallerClass) {

        System.out.println(helloThere + theCallerClass);

        if (theCallerClass.contains("A")) {
            System.out.println("...another text from " + theCallerClass);
        }
    }


}
