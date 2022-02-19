package gajiagent;
import java.util.Scanner;//untuk memasukan package scanner

public class Gajiagent {
    /**
 * <h1>Gaji Agent</h1>
 * Dalam sebuah agent penjualan. Agent akan menerima gaji pokok sebesar Rp.500.000,00 
 * perbulan. Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item jika
 * berhasil menjual minimal 40 item. Agent akan menerima bonus penjualan 35% dari total 
 * penjualan jika berhasil menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item
 * penjualan jika berhasil menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item
 * item. Selain itu agen hanya menerima bonus 10% setiap itemnya. Harga setiap item adalah Rp. 
 * 50.000,00.
 * <p>
 * <b>Input Format</b>
 * <p>
 * Satu baris berupa jumlah penjualan bulan ini.
 * <p>
 * <b>Output Format</b>
 * <p>
 * Satu baris berupa jumlah penjualan bulan ini.
 * <p>
 * <b>Lesson Learn</b>
 * <p>
 * Dapat digunakan metode if else dalam pemecahan masalaah
 * <p>
 * @author Muhammad Rafi Farhan
 * @version 1.0
     * @param args
 * @since 2022-02-17
 */

    public static void main(String[] args){
        int gajiTotal;
        int gajiPokok=500000;
        int harga=50000;
        Scanner keyboard = new Scanner(System.in);
        int penjualan = keyboard.nextInt();
        
        
        if (penjualan>=40&&penjualan<=80){
            gajiTotal = (int) (gajiPokok+(0.25*(penjualan*harga)));
            System.out.println(gajiTotal);
        }
        else if (penjualan>80){
            gajiTotal = (int) (gajiPokok+(0.35*(penjualan*harga)));
            System.out.println(gajiTotal);
        }
        else if (penjualan<15){
            gajiTotal = (int) (gajiPokok-(0.15*(penjualan*harga)));
            System.out.println(gajiTotal);
        }
        else{ 
            gajiTotal = (int) (gajiPokok+(0.1*(penjualan*harga)));
            System.out.println(gajiTotal);
        }
               
    }
    
}
