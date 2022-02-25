package datatypes;
import java.util.Scanner;
/**
* <h1> 8 Primitive Data Types</h1>
* Java has 8 primitive data types; 
* char, boolean, byte, short, int,
* long, float, and double. We'll
* work with the primitives used 
* to hold integer values
* <b>(byte, short, int, and long)</b>:
* <p>
* A byte is an 8-bit signed integer
* <p>
* A short is a 16-bit signed integer.
* <p>
* An int is a 32-bit signed integer.
* <p>
* A long is a 64-bit signed integer
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-10
*/
public class Datatypes {
/**
* <h2>Input Format</h2>
* The first line contains an integer, T, denoting 
* the number of test cases. Each test case, T, is 
* comprised of a single line with an integer, n, 
* which can be arbitrarily large or small.
* 
* <h3>Output Format</h3>
* For each input variable n and appropriate 
* primitive dataType, you must determine if 
* the given primitives are capable of
* storing it.
*
     * @param args
*/

    public static void main(String[] args) {
        
        // create a new scanner
        Scanner keyboard = new Scanner(System.in);
        int t=keyboard.nextInt();
        
        //for one or more appropriate primitive dataType
        for(int i=0;i<t;i++){
          try {
              long n=keyboard.nextLong();
              System.out.println(n+" can be fitted in:");
              
              if(n>=-128 && n<=127)System.out.println("* byte");
              if(n>=-32768 && n<=32767)System.out.println("* short");
              if(n>=-2147483648 && n<= 2147483647)System.out.println("* int");
              if(n>=-9223372036854775808L && n<= 9223372036854775807L)System.out.println("* long");
          }  
          
          //if the number cannot be stored in one of the four aforementioned primitives
          catch(Exception e){
              System.out.println(keyboard.next()+" can't be fitted anywhere.");
          }
        }
    }
}
   
     
        
        
        
        

