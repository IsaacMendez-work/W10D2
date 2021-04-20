package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      When working with Strings, there are some things to be aware of. Specifically, because Java doesn't store strings in variables (rather, it stores a reference to where the string is kept), String equality is handled differently from numerical equality.
//      With numbers if two variables have the same value, they are equal. With Strings, this is only true if they have the same reference. For example:
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
//      Here, even though both say "Hello, World!" they are not equal because the values being compared are their reference points.
//      Rather than use ==, with strings we use .equals() to compare character by character if they match.
        if (s1.equals(s2)) System.out.println("Using .equals() for these two Strings results in true");
        else System.out.println("Using .equals() for these two Strings results in false");
    }
//
}
