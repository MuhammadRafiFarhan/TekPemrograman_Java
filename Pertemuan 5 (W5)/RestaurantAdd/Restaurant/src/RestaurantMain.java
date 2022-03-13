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
        
        menu.Pesanan("Bala-bala", 15);
        menu.Pesanan("Gehu", 21);
        menu.Pesanan("Tahu", 1);
        menu.Pesanan("Molen", 20);
     
        menu.tampilMenuMakanan();
}
    
}