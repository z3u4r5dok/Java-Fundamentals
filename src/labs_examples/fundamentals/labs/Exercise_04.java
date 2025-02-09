package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        byte b; short s; long l; float f; double d; char c; boolean bl;
        b = 3;
        s = 34;
        l = 342343l;
        f = 1.34f;
        d = 3323.343;
        c = 'X';
        bl = false;

        System.out.println("byte b is: " + b );
        System.out.println("short s is: " + s );
        System.out.println("long l is: " + l );
        System.out.println("float f is: " + f );
        System.out.println("double d is: " + d );
        System.out.println("char c is: " + c );
        System.out.println("boolean bl is: " + bl );

    }

}
