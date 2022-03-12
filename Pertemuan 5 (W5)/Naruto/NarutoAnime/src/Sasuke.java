public class Sasuke extends Itachi {
    private String Dojutsu = "Sharingan";
    
    void printDojutsu() {
       super.printDojutsu(); 
       // Memanggil isi dari printDojutsu() pada class Itachi
       System.out.println(this.Dojutsu);
       
       
    }
}
