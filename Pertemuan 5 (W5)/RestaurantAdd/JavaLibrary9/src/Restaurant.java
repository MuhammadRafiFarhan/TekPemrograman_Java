public class Restaurant {
    public String[] nama_makanan;
	public double[] harga_makanan;
	public int[] stok;
	public static byte id = 0;
	
	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama; 
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
        
        /* Menambahkan fitur pemesanan dan mengurangi setiap stok yang ada*/
        
        /* Mencari id makanan*/
        public int getID(String nama_Makanan) {
		byte ID = 0;
		for(byte i = 0; i <= id; i++) {
			if(this.nama_makanan[i] == nama_Makanan) {
				ID = i;
				break;
			}
		}
		return ID;
	}
        
        /* Memesan makanan dan mengurangi stok dengan melihat id dari makanan yang diminta */
        /* Jika stok = 0 maka menampilkan "maaf, stok ... habis" */
        /* Jika stok >= JmlPesanan maka menampilkan pemesanan akan dilaksakan dan stok barang berkurang sejumlah pemesanan */
        /* Jika stok < JmlPesanan maka menampilkan "maaf, stok ... kurang. Mohon pesan sesuai stok yang tersedia!" */
        
        public void Pesanan (String nama, int JmlPesanan) {
		if (stok[getID(nama)] >= JmlPesanan){
                    stok[getID(nama)] -= JmlPesanan;
                    System.out.println("\nPemesanan dengan jumlah " + JmlPesanan +" dengan nama item " + nama + " berhasil\n");
		}
                else if (stok[getID(nama)] < JmlPesanan && stok[getID(nama)]!= 0){
			System.out.println("\nMaaf, stok " + nama + " kurang. Mohon pesan sesuai stok yang tersedia!\n");
                }
                else if (stok[getID(nama)]== 0){
                        System.out.println("\nMaaf, stok " + nama + " Habis\n");
                }
        }
}