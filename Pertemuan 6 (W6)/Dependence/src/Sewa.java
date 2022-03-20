public class Sewa {
     //state
    private String nama;
    private String jenis;
    private int kode;
    private int harga;
    
    //encapsulation nama
    public void setNama(String _nama){
        this.nama = _nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    //encapsulation jenis
    public void setJenis(String _jenis){
        this.jenis = _jenis;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    
    //encapsulation kode
    public void setKode(int _kode){
        this.kode = _kode;
    }
   
    public int getKode(){
        return this.kode;
    }
    
     //encapsulation harga
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public int getHarga(){
        return this.harga;
    }
   
    //behaviour
    void cetak(){
        System.out.println("Keterangan Produk");
        System.out.println("=================");
        System.out.println("nama produk : " +nama);
        System.out.println("kode produk : " +kode);
        System.out.println("jenis produk : " +jenis);
        System.out.println("harga barang : " +harga);
        System.out.println("");
    }    
}
