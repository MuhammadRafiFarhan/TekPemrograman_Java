public class RestaurantMain {
    public static void main (String[] args){
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);

        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1000, 20);

        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1000, 0);

        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1000, 20);

        menu.tampilMenuMakanan();
    }
}
