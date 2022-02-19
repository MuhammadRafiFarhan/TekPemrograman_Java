package berhitung;
import java.util.Scanner;//untuk memasukan package scanner

public class Kalkulator{
/**
 * <h1>Berhitung</h1>
 * Terdapat 5 buah operator matematika: 
 * <p>
 * - Penjumlahan, direpresentasikan dengan '+'.
 * <p>
 * - Pengurangan, direpresentasikan dengan '-'.
 * <p>
 * - Perkalian, direpresentasikan dengan '*'.
 * <p>
 * - Pembagian, direpresentasikan dengan '/'.
 * <p>
 * - Sisa hasil bagi, direpresentasikan dengan '%'.
 * <p>
 * <b>Input Format</b>
 * <p>
 * Satu baris berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi, 
 * yang menyatakan terdapat operasi "A operator B".
 * <p>
 * <b>Output Format</b>
 * <p>
 * Satu baris berisi sebuah bilangan bulat, hasil "A operator B".
 * <p>
 * <b>Lesson Learn</b>
 * <p>
 * - Terdapat dua cara yang saya temukan dalam mengerjakan kasus seperti ini
 * yaitu dapat dengan menggunakan switch case dan juga dapat menggunakan else if
 * <p>
 * - Cara untuk melakukan scan keyboard terhadap tipe data char dapat menggunakan
 * [char c = reader.next().charAt(0);], [char c = reader.findInLine(".").charAt(0);]
 * dan juga [char c = reader.next(".").charAt(0);]
 * @author Muhammad Rafi Farhan
 * @version 1.0
     * @param args
 * @since 2022-02-17
 */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        /**
         * keyboard.next().charAt(0) digunakan untuk mengambil char dari keyboard
         * dengan cara mengambil karakter pertama dari keyboard.next() dengan menggunakan
         * charAt(0).
         */ 
        char operator = keyboard.next().charAt(0);
        int num2 = keyboard.nextInt();
        int result;

    //setiap kasus perhitungan dapat dinyatakan dengan menggunakan switch case    
    switch (operator) {
       
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      case '%':
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
        break;
        
      default:
        System.out.println("Perhitungan tidak valid!");
        break;
    }
  }
}
