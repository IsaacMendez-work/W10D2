package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
System.out.println("Examples of how Strings are compared: ");
//      When working with Strings, there are some things to be aware of. Specifically, because Java doesn't store Strings in variables (rather, it stores a reference to an instance of the String), String equality is handled differently from numerical equality.
//      With numbers, if two variables have the same value, they are equal. With Strings, this is only true if they have the same reference. For example:
        int n1 = 3;
        n1 += 2;
        int n2 = 3;
        n2 += 2;

        if (n1 == n2) System.out.println("Using == for these two integers results in true");
        else System.out.println("Using == for these two integers results in false");
//      Since both numbers are 3, the == returns the true result.


        String s1 = "Hello";
        s1 += ", World!";
        String s2 = "Hello";
        s2 += ", World!";

        if (s1 == s2) System.out.println("Using == for these two Strings results in true");
        else System.out.println("Using == for these two Strings results in false");
//      Here, even though both say "Hello, World!" they are not equal because the values being compared are their reference points, not their contents.
//      Rather than use ==, with Strings we often use .equals() to compare character by character if they match.
        if (s1.equals(s2)) System.out.println("Using .equals() for these two Strings results in true");
        else System.out.println("Using .equals() for these two Strings results in false");


//      An alternative to .equals() for Strings is to use .intern(), which is less time consuming to compile, though it does require an additional step.
        String i1 = "Hello";
        i1 += ", World!";
        String i2 = "Hello";
        i2 += ", World!";
//      Here we've declared the variables the same as when we ran them above. The additional step is to set the a variable equal to both each of the above variables run through .intern(), so their value is saved.
        String i3 = i1.intern();
        String i4 = i2.intern();

        if (i3 == i4) System.out.println("Using == for these two .intern() Strings results in true");
        else System.out.println("Using == for these two .intern() Strings results in false");
//      NOTE: .intern() has its own overhead, so it's best to only use it in a scenario where you'll be frequently comparing Strings.



//      A key difference between primitive data types and a class like String is that classes have built-in functions. These functions (also known as methods) allow us to operate on data.
//      String Class methods include length (.length), creating new string(s) from existing ones (.concat, .replace, .toLowerCase, .toUpperCase, .trim, .split), extracting substring (.charAt, .substring), testing substrings (.contains, .endsWith, .startsWith, .indexOf, .lastIndexOf), comparing (.equals, .equalsIgnoreCase, .isEmpty, .compareTo, .compareToIgnoreCase), formatting (.format), and stringing for non-Strings (.valueOf). An example of working with strings: 

System.out.println("\nConverting non-String types to Strings:");
        // Java would not allow you to set an int variable's value equal to a String. For example int numberVar = "100" will return an error. However, we can use .valueOf() to convert the int into a String:
        int numberVar = 100;
        String stringVar = String.valueOf(numberVar);
        System.out.println("Using String.valueOf(): " + stringVar);

//      One way to convert ints to a String is to use concatenation, like in the System.out.println() above.
        int i = 2;
        int j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println("Using concatenation: " + output);
    }
}
