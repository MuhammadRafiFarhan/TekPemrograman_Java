public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    String Dojutsu = super.Dojutsu; // Mengakses Rinnegan pada class Rikudo
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    
    void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    
    void printDojutsu() {
       System.out.println(this.Dojutsu); // Rinnegan
       setDojutsu(); // mengubah output keluaran menjadi "Mangekyou Sharingan"
       System.out.println(this.Dojutsu); // Mangekyou Sharingan
    }
    
    
}

