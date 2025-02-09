package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int length = str.length();
        System.out.println(length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean equals = str.equals(str2);
        System.out.println(equals);

        // please concatenate str & str2 and set the result to a new String variable below

        String nstring;
        nstring = str + " " + str2;
        System.out.println(nstring);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        int search = str.indexOf(3);
        String subStr = str2.substring(0,4);
        String rplc = "Testing a replace string";
        String nwrplc = rplc.replace("a" , "to");

        System.out.println(search);
        System.out.println(subStr);
        System.out.println(nwrplc);


    }


}