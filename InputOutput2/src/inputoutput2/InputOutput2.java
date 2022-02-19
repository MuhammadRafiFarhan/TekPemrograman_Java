package inputoutput2;
import java.util.Scanner;//untuk memasukan package scanner

public class InputOutput2 {
/**
 * <h1>Input and Output 2</h1>
 * Java's System.out.printf function can be used to print formatted output.  
 * The purpose of this exercise is to test your understanding of formatting 
 * output using printf.
 * <p>
 * To get you started, a portion of the solution is provided for you in the 
 * editor; you must format and print the input to complete the solution. 
 * <p>
 * <b>Input Format</b>
 * <p>
 * - Every line of input will contain a String followed by an integer.
 * <p>
 * - Each String will have a maximum of 10 alphabetic characters.
 * <p>
 * - Each integer will be in the clusive range from 0 to 999.
 * <p>
 * <b>Output Format</b>
 * <p>
 * - The first column contains the String and is left justified using exactly 15
 * characters.
 * <p>
 * - The second column contains the integer, expressed in exactly 3 digits; 
 * if the original input has less than three digits, you must pad your output's 
 * leading digits with zeroes.
 * <p>
 * <b>Lesson Learn</b>
 * <p>
 * System.out.printf("%-15s%03d%n", name, number)
 * <p>
 * - [%-15s] lambang minus menyatakan 'left justified' pada soal
 * <p>
 * - [%-15s] 15 menyatakan 15 input karakter
 * <p>
 * - [%03d] 03 menyatakan 3 digit input integer
 * @author Muhammad Rafi Farhan
 * @version 1.0
     * @param args
 * @since 2022-02-17
 */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("====================================");
        for(int i=0;i<3;i++){
            //gunakan next() untuk membaca input string tanpa spasi
            String name=keyboard.next();
            //gunakan nextInt() untuk membaca input integer
            int number=keyboard.nextInt();
            /**
             * <b>System.out.printf("%-15s%03d%n", name, number)<b>
             * <p>
             * - [%-15s] lambang minus menyatakan 'left justified' pada soal
             * <p>
             * - [%-15s] 15 menyatakan 15 input karakter
             * <p>
             * - [%03d] 03 menyatakan 3 digit input integer
             */
            System.out.printf("%-15s%03d\n", name, number);
        }
        System.out.println("====================================");
        }
    }
    

