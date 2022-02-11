package strings;
import java.io.*;
import java.util.Scanner;
/**
* <h1>Strings</h1>
* The elements of a String are called characters. 
* The number of characters in a String is called 
* the length, and it can be retrieved with the String.length() 
* method.
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-11
*/
public class Strings {
    /**
* <h2>Input Format</h2>
* The first line contains a string A. The second line 
* contains another string B. The strings are 
* comprised of only lowercase English letters.
* 
* <h3>Output Format</h3>
* There are three lines of output:
* <p>
* - For the first line, sum the lengths of A and B.
* <p>
* - For the second line, write Yes if A is lexicographically greater than B otherwise print No 
*   instead.
* <p>
* - For the third line, capitalize the first letter in both A and and B print them on a single line, 
* separated by a space.
*
     * @param A
     * @param B
     * @return 
*/
    //does A lexicographically larger than B?
    public static String ALargerB(String A, String B) {
        return A.compareTo(B) > 0 ? "Yes" : "No";
    }
    public static void main(String[] args) {
        //take input from keyboard
        Scanner keyboard = new Scanner(System.in);
        String A = keyboard.next();
        String B = keyboard.next();

        /*
        sum the lengths of A and B and determine 
        if A is lexicographically larger than B
        */
        System.out.println(A.length()+B.length());
        System.out.println(ALargerB (A, B));
        
        //Capitalize the first letter in A and B and print them on a single line
        String ab=A.substring(0,1).toUpperCase();
        String ab1=B.substring(0,1).toUpperCase();
        System.out.println(ab+A.substring(1)+" "+ab1+B.substring(1));
    }
}