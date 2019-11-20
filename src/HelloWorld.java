public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        System.out.print("Hello, ");
//        System.out.print("World!");

        // TODO 1: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        // TODO 2: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Miguel";
        System.out.println(myString);

        // TODO 3: Change your code to assign a character value to myString. What do you notice?
        myString += 'c';
        System.out.println(myString);

        // TODO 4: Change your code to assign the value 3.14159 to myString. What happens?
        myString += 3.14159;
        System.out.println(myString);

        // TODO 5: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;
//        System.out.println(myNumber); // Error: variable not initialized

        // TODO 6: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14; // Error: 3.14 is of type double and 'myNumber' is of type long (two different types)

        // TODO 7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);

        // TODO 8: Change your code to assign the value 123 to myNumber.
        //  Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        myNumber = 123;
        System.out.println(myNumber);
        myNumber = (long) 3.14;
        System.out.println(myNumber);
        /*
        ANSWER: Because long and double deal with two different data types.
        long deals with integers and implicit casting takes place to turn type int to type long.
        3.14 is of type double. Explicit casting is needed to assign 3.14 to myNumber of type long.
        */

        // TODO 9: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        float myNewNumber = (float) 3.14;
        System.out.println(myNewNumber);
        myNewNumber = 3.14f;
        System.out.println(myNewNumber);
        // TODO 10: Copy and paste the following code blocks one at a time and execute them
        /*  int x = 5;
            System.out.println(x++);
            System.out.println(x);
            ------------------------
            int y = 5;
            System.out.println(++y);
            System.out.println(y);
            ------
            What is the difference between the above code blocks? Explain why the code outputs what it does.
        */
        int x = 5;
        System.out.println(x++); // Prints 5 because this prints the value first then increments the value
        System.out.println(x); // Prints the final value of x

        int y = 5;
        System.out.println(++y); // Prints 6 because it increments prior to printing the value of y
        System.out.println(y); // Prints value of final value of y

        //  TODO 11: Try to create a variable named class. What happens?
//        var class; // class is a reserved word therefore not available
        //  TODO 12: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        /*   String theNumberThree = "three";
             Object o = theNumberThree;
             int three = (int) o;
             -----
             Copy and paste the code above and then run it. Does the result match with your expectation?
             How is the above example different from the code block below?
             ------------------------
             int three = (int) "three";
        */
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // RESPONSE: code will compile due to the variable being "wrapped".
        // At run time code will break because object will be unwrapped revealing incompatible data types.

//        int three = (int) "three"; // code will not compile due data type being visible and known they are not compatible

        //  TODO 13: Rewrite the following expressions using the relevant shorthand assignment operators:
        /*   int x = 4;
             x = x + 5;
             ------------------------
             int x = 3;
             int y = 4;
             y = y * x;
             ------------------------
             int x = 10;
             int y = 2;
             x = x / y;
             y = y - x;
         */
        int a = 4;
        a += 5;
        System.out.println(a); // 9

        int b = 3;
        int c = 4;
        c *= b;
        System.out.println(c); // 12

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;
        System.out.println(d); // 5
        System.out.println(e); // -3

        //  TODO 14: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        RESPONSE: it overflows. Just loops through.
        int testNum = 2147483647;
        System.out.println(testNum);
        testNum++;
        System.out.println(testNum);
        System.out.println(Integer.MAX_VALUE);
        //   Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

    }
}
