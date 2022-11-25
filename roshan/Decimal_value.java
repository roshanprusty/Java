package com.roshan;
        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;
        import java.util.TreeSet;

public class Decimal_value {

    public static void main(String args[]) {

        // Creating instance of BigDecimal in Java
        BigDecimal twentyOne = new BigDecimal("21.01");
        // String constructor behaves as they seen

        BigDecimal twentyTwo = new BigDecimal("22.01");
        BigDecimal _22 = new BigDecimal(22.01);
        // double constructor, doesn't behave as they look

        System.out.println(twentyOne + ", " + twentyTwo + ", " + _22);


        // How to get the scale of BigDecimal number
        int scale = twentyOne.scale();
        System.out.printf("scale of BigDecimal %s is %d %n", twentyOne, scale);
        int _scale = _22.scale();
        System.out.printf("scale of BigDecimal %s is %d %n", _22, _scale);


        //How to set the scale of BigDecimal number
        _22 = _22.setScale(4, RoundingMode.HALF_DOWN);
        // may return a different BigDecimal object
        System.out.printf("new scale of BigDecimal %s is %d %n", _22, _22.scale());


        // Adding two BigDecimal numbers in Java
        BigDecimal sum = twentyOne.add(twentyOne); // adding BigDecimal of same scale
        BigDecimal addition = twentyOne.add(_22);  // adding BigDecimal of different scale
        System.out.printf("sum of %s and %s is %s %n", twentyOne, twentyTwo, sum);
        System.out.printf("addition of %s and %s is %s %n", twentyOne, _22, addition);


        // Subtracting two BigDecimal in Java
        BigDecimal minus = twentyOne.subtract(twentyOne);
        // subtracting BigDecimal of same scale
        BigDecimal subtraction = twentyOne.subtract(_22);
        // subtracting BigDecimal of different scale
        System.out.printf("minus of %s and %s is %s %n", twentyOne, twentyTwo, minus);
        System.out.printf("subtraction of %s and %s is %s %n", twentyOne, _22,
                subtraction);


        // Multiplying BigDecimals in Java
        BigDecimal product = twentyOne.multiply(twentyOne);
        // multiplying BigDecimal of same scale

        BigDecimal multiplication = twentyOne.multiply(_22);
        // multiplying BigDecimal of different scale
        System.out.printf("product of %s and %s is %s %n", twentyOne,
                twentyTwo, product);
        System.out.printf("multiplication of %s and %s is %s %n",
                twentyOne, _22, multiplication);


        // Divide two BigDecimal in Java
        BigDecimal two = new BigDecimal("2.0");
        BigDecimal divide = twentyOne.divide(two); // dividing BigDecimal of same scale
        BigDecimal division = _22.divide(two);  // dividing BigDecimal of different scale
        System.out.printf("divide of %s and %s is %s %n", twentyOne, two, divide);
        System.out.printf("division of %s and %s is %s %n", _22, two, division);
    }
}
/*
Output
        21.01, 22.01, 22.010000000000001563194018672220408916473388671875
        scale of BigDecimal 21.01 is 2
        scale of BigDecimal 22.010000000000001563194018672220408916473388671875 is 48
        new scale of BigDecimal 22.0100 is 4
        sum of 21.01 and 22.01 is 42.02
        addition of 21.01 and 22.0100 is 43.0200
        minus of 21.01 and 22.01 is 0.00
        subtraction of 21.01 and 22.0100 is -1.0000
        product of 21.01 and 22.01 is 441.4201
        multiplication of 21.01 and 22.0100 is 462.430100
        divide of 21.01 and 2.0 is 10.505
        division of 22.0100 and 2.0 is 11.005*/