package inputoutput;
import java.util.Scanner; //untuk memasukan package scanner

public class InputOutput {
/**
 * <h1>Input and Output</h1>
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, 
 * split the string into tokens.We define a token to be one or more consecutive 
 * English alphabetic letters.Then, print the number of tokens, followed by each 
 * token on a new line. 
 * <p>
 * <b>Input Format</b>
 * <p>
 * A single string s.
 * <p>
 * <b>Output Format</b>
 * <p>
 * - First line, print an integer, n
 * <p>
 * - Print each of the n tokens on a new line in the same order as they appear 
 * in input string
 * <p>
 * <b>Lesson Learn</b>
 * <p>
 * - trim() digunakan untuk memotong karakter dengan spasi pada bagian awal 
 * dan akhir
 * <p>
 * - split() berguna untuk membuat sebuah Array Of String dari
 * String awal yang dipisahkan oleh tanda pemisah tertentu
 * @author Muhammad Rafi Farhan
 * @version 1.0
     * @param args
 * @since 2022-02-17
 */
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //gunakan nextLine() untuk membaca input string yang memiliki spasi
        String sentence = keyboard.nextLine(); 
       
        /**
         * trim() digunakan untuk memotong karakter dengan  
         * spasi pada bagian awal dan akhir
         */
        sentence = sentence.trim();
        if (sentence.length() == 0) {
            System.out.println("input tidak ditemukan");
        } else {
            /**
             * split() berguna untuk membuat sebuah array of String dari sebuah
             * String awal yang dipisahkan oleh tanda pemisah tertentu
             */
            String[] strings = sentence.split("[!,?._'@ ]+");
            System.out.println(strings.length);
            for (String newSentence : strings)
                System.out.println(newSentence);
        }
    }
}
