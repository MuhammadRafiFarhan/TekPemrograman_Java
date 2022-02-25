/**
* <h1>Barang Class</h1>
* <p>
* This class is used to define the data structure
* that will be used by the object.
* <p>
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-24
*/
public class Barang {
    String kode_barang;
    String nama_barang;
    /**
    * 'stock' will be encapsulated by using
    * private variable to prohibit the usage
    * of other mathematic operation other than
    * plus, and to access it, we can use getter 
    * and setter. 
    */
    private int stok;
    
    public int getStok() {
	return stok; /* To get the stock after adding the quantity*/
	}
    
    public void setStok(int stok) {
	this.stok += stok; /* Set the stock by adding the quantity*/
	}

    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }
}