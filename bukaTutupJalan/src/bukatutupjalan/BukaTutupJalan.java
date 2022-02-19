package bukatutupjalan;
import java.util.Scanner;//untuk memasukan package scanner

public class BukaTutupJalan {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String plat1 = keyboard.nextLine();
        String plat2 = keyboard.nextLine();
        String plat3 = keyboard.nextLine();
        String plat4 = keyboard.nextLine();
         
        String result = plat1+plat2+plat3+plat4; 
        //untuk menggabungkan keempat nomor plat tersebut
        System.out.println(result);
        
        long l = Long.parseLong(result);
        //untuk mengkonversi tipe data String ke long
        System.out.println("long l = " + l);
      
        //penentuan apakah keempat mobil tersebut boleh jalan? 
        int sisa = (int) ((l-999999)%5);
        System.out.println(sisa);
        if(sisa==1){
            System.out.println("jalan");
        }else{ System.out.println("berhenti");
        }
        }
}
        
