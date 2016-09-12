package com.company;

public class Main {

    public static void main(String[] args) {

        //instantiate all the classes we're going to use!
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();
        ClassY classY = new ClassY();

        //lest play around, call a method from class to class using composition instead of inheritance!
        classA.callingClassC();

        //Lest create a reference toward our Interface
        ContractNeverChanges contractNeverChanges = new ContractImpl();

        //Using the "callback" approach!
        classA.register(contractNeverChanges);
        classB.register(contractNeverChanges);
        classD.register(contractNeverChanges);

        //Implementing the contract
        classC.printContractNeverChanges("C");

        //Calling the method directly
        classY.printSomething();

    }
}
