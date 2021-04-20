package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      In order to take full advantage of functions, we need to be able to receive a result for the calculation a function runs.
        double result = calculateInterest(100d, 0.05d, 10);
        System.out.printf("$%f", result);
    }

    static double calculateInterest(double amt, double rate, int years) {
        /*
        double interest = amt * rate * years;
//      Here, we are running a calculation on the right side of the equation, and setting the result equal to a variable.
        return interest;
//      We are then returning that variable!
//      An cleaner way to run simple code like this is to just return the calculation:
        */
        return amt * rate * years;
    }


}
