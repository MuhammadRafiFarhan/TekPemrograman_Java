public class Produk {
    //state
    private String nama;
    private String jenis;
    private int kode;
    private int berat;
    private int harga;
    private int stok;
    
    //encapsulation nama
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    //encapsulation jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    
    //encapsulation kode
    public void setKode(int kode){
        this.kode = kode;
    }
    
    public int getKode(){
        return this.kode;
    }
    
    //encapsulation berat
    public void setBerat(int berat){
        this.berat = berat;
    }
    
    public int getBerat(){
        return this.berat;
    }
    
    //encapsulation harga
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    //encapsulation stok
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public int getStok(){
        return this.stok;
    }
    
    
    //behaviour
    void cetak(){
        System.out.println("Keterangan Produk");
        System.out.println("=================");
        System.out.println("nama produk : " +nama);
        System.out.println("kode produk : " +kode);
        System.out.println("berat bersih : " +berat);
        System.out.println("jenis produk : " +jenis);
        System.out.println("harga barang : " +harga);
        System.out.println("stok tersedia : " +stok);
        System.out.println("");
    }    
}
