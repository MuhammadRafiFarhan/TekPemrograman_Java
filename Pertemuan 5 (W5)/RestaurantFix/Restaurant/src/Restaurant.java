public class Restaurant {
    
    /* Break up classes that have too many responsibilities */
    /* Break the class into two classes, Restaurant class and Food class */
    
    /* Always keep the data private */
    private Makanan makanan[];
    private static byte id = 0;
    
    /* Always initialize data */
    public Restaurant() {
    makanan = new Makanan[10];
    }
    
    /* Create object and call setter from the Makanan class */
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        makanan[id] = new Makanan();
        makanan[id].setNama_makanan(nama);
        makanan[id].setHarga_makanan(harga);
        makanan[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
            System.out.println(makanan[i].getNama_makanan()+"["+makanan[i].getStok()+"]"+"\tRp. "+makanan[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(makanan[id].getStok() == 0){
            return true;
        }
        else{
            return false;
        }
}
    public static void nextId(){
        id++;
    }
}


