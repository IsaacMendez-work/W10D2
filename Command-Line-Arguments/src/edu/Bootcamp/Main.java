package edu.Bootcamp;

public class Main {

//      Here, we will be running arguments through the command line
    public static void main(String[] args) {
//      As seen above, the public static void main class uses an array of strings, and it uses arguments.
//      We will make command line-executable app that runs depending on if we provide args or not.
        if (args.length < 1) System.out.println("Shoot, it looks like no arguments were provided in the command line.");
//      Run the compiler for this page. The build will return the "no args provided" message. Now, open the command line and access this folder. When we ran the compiler it created an "out" folder. Change directories in command line to be in the out folder, then again to be in the production folder, then one last time to be in the Command-Line-Arguments folder.
        else for (String commandLineArg: args) System.out.println(commandLineArg);
//      If we provide args, we will be able to use the above code to print those them to the command line.
//      In the terminal, check working directory and ensure you're in out/production/Command-Line-Arguments. To run the application, type the following:
//          java edu.Bootcamp.Main
//      The result should be the "no args provided" message. (Be sure to capitalize where needed!)
//      To add arguments, just add them after java run code, separated by a space:
//          java edu.Bootcamp.Main Hello "my name is" Eyke
    }
}
