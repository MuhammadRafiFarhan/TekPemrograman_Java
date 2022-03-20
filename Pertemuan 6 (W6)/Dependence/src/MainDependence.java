public class MainDependence {
    
    public static void main(String[] args){
        //initansiasi objek
        Produk roti = new Produk();
        roti.setNama("Roti Kering");
        roti.setJenis("konsumsi");
        roti.setKode(0110);
        roti.setBerat(128);
        roti.setStok(10);
        roti.setHarga(8500);
        roti.cetak();
        
        //initansiasi objek 2
        Produk mie = new Produk();
        mie.setNama("Mie Enak");
        mie.setJenis("konsumsi");
        mie.setKode(0111);
        mie.setBerat(125);
        mie.setStok(20);
        mie.setHarga(1200);
        mie.cetak();
        
        //initansiasi objek 2  
        Sewa gameboy = new Sewa();
        gameboy.setNama("Super Mario 3");
        gameboy.setJenis("game");
        gameboy.setKode(0010);
        gameboy.setHarga(100000);
        gameboy.cetak();
    }    
}
