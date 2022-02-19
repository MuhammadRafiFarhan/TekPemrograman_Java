package bignumber;
import java.util.Scanner;//untuk memasukan package scanner
import java.math.*;

public class Biginteger {
/**
 * <h1>Big Number</h1>
 * In this problem, you have to add and multiply huge numbers!
 * These numbers are so big that you can't contain them in any
 * ordinary data types like a long integer.
 * <p>
 * Use the power of Java's BigInteger class and solve this problem.
 * <p>
 * <b>Input Format</b>
 * <p>
 * - There will be two lines containing two numbers, a and b.
 * <p>
 * - a and b are non-negative integers and can have maximum 200 digits
 * <p>
 * <b>Output Format</b>
 * <p>
 * Output two lines. The first line should contain a + b,
 * and the second line should contain a x b. Don't print 
 * any leading zeros.
 * <p>
 * <b>Lesson Learn</b>
 * <p>
 * - add() dan multiply() adalah salah bagian dari package math yang berfungsi
 * sebagai operator matematika.
 * <p>
 * - BigInteger tidak dapat mengkonversi dari integer biasa dan akan muncul
 * peringatan berbunyi 'BigInteger(long) has private access in Big Integer.'
 * @author Muhammad Rafi Farhan
 * @version 1.0
     * @param args
 * @since 2022-02-17
 */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //mengambil input angka dari keyboard sebagai sebuah string
        String numOne = keyboard.nextLine();
        String numTwo = keyboard.nextLine();
        
        //mengkonversi string num menjadi BigInteger
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        
        //melakukan dua operasi matematika yang diminta pada soal
        BigInteger sum = bigNumOne.add(bigNumTwo);
        BigInteger times = bigNumOne.multiply(bigNumTwo);
        System.out.println(sum);
        System.out.println(times);
    }
}
   