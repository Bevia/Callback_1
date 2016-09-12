package com.company;

/**
 * Created by vincentbevia on 12/09/16.
 */
public class ClassC implements ContractNeverChanges{

    //implementing the never changing interface, this give us lots of power over what we couple in
    //our approach!!

    @Override
    public void printContractNeverChanges(String theCallerClass) {
        System.out.println("I'm " +  theCallerClass +" overriding the contracts method jijijijiji");
    }

    //this is an instace method that I'm calling from another object!
    public void classCMethod() {
        System.out.print("\nfrom within Class C method, I've called by ClassA\n");
    }
}
