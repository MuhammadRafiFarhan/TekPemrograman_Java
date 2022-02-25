/**
* <h1>Inventori Class</h1>
* <p>
* This class act as the main class and define
* the object and also show the object that has
* been created. This class also add new stock
* to the previous object.
* <p>
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-24
*/
public class Inventori {
	Barang[] barangs;
	
	void initBarang() {
            barangs = new Barang[2];  /*barangs will create two new array of barang*/
            barangs[0] = new Barang("001", "Baju", 10); /*first new Barang*/ 
            barangs[1] = new Barang("002", "Celana", 20); /*second new Barang*/ 
            }
	
	void showBarang() {
            /**
            * This will print out the name of barang 
            * with the new stock quantity after adding
            * it with new stock in setStock.
            */
            System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
            System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
            }
	
	void pengadaan() {
            initBarang();
            /*this will add the stock number*/
            barangs[0].setStok(20); /* add 20 stock*/
            barangs[0].setStok(30); /* add 30 stock*/
            barangs[0].setStok(30); /* add 30 stock*/ 	
            showBarang(); /* Show the number and the name after adding the new stock*/
            }
	
	public static void main(String[] args) {
            Inventori beli = new Inventori(); /*this will call the class inventory*/
            beli.pengadaan(); /*this will call the void pengadaan to add the stock*/
            }
}