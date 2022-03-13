import java.util.Scanner;
 
public class RestaurantMain {
    
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        
        /* Melakukan pemesanan */
        Scanner ItemName = new Scanner(System.in);
        System.out.println("enter nama item :");
        String getName = ItemName.next();
        
        Scanner Jumlah = new Scanner(System.in);
        System.out.println("enter jumlah item :");
        int Jumlah_Pesanan = Jumlah.nextInt();
                
        menu.Pesanan(getName, Jumlah_Pesanan);
        menu.tampilMenuMakanan();
}
    
}