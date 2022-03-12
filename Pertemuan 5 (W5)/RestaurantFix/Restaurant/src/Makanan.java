public class Makanan {
    
    /* DESIGN HINT */
    
    /* Always keep the data private */
    /* Don’t use too many basic types in a class */
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    /* Always initialize data */
    public Makanan() {
        this.nama_makanan = "";
        this.harga_makanan = 0;
        this.stok = 0;
    }
    
    /* Not all fields need individual field accessors and mutators */
    /* Accessors and mutators */
    public void setNama_makanan(String nama_makanan){
		this.nama_makanan = nama_makanan;
    }
    
    public String getNama_makanan(){
		return nama_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
    }
    
    public double getHarga_makanan() {
		return harga_makanan;
    }

    public void setStok(int stok) {
		this.stok = stok;
    }
    
    public int getStok() {
		return stok;
    }
}
