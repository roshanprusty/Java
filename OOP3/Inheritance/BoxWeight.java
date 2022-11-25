package com.OOP3.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //call the parent class constructor
                        //used to initialise values present in parent class
                        /*Java enforces that the call to super (explicit or not) must be the first statement in the constructor.
                          This is to prevent the subclass part of the object being initialised prior to the superclass part of
                          the object being initialised. */

//        super(); //default one will be called



        /*
        System.out.println(this.l);
        System.out.println(super.l);

        --> you might have question in your mind that if we are able to take value from this.l then why there is need of super.l
        --> ans is : super keyword in simple terms refers to superclass (parent) objects
        --> let's have one scenario -:
        System.out.println(super.weight); here with the help of super keyword we are able to take the value from the superclass
                                          super has having no idea what base class contain.
        System.out.println(this.weight);  here we are taking the value from this class only



             */



        this.weight = weight;
    }



    BoxWeight(Box other, double weight) {
        super(other);
        this.weight = weight;
    }

    BoxWeight(double weight) {
        super();
        this.weight = weight;
    }

    BoxWeight() {
        super();
        this.weight = -1;
    }
}
