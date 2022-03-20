/**
 * Assosiation adalah hubungan antara object.
 * Assosiation berarti bahwa sebuah object 
 * menggunakan object yang lain yang
 * menjadi sebuah relasi dimana semua
 * object memiliki lifecycle nya sendiri
 * dan tidak ada yang bertindak sebagai owner.
 */
import java.util.ArrayList;
import java.util.List;

public class MainAssosiation {
    public static void main (String[] args){
        Developer dev = new Developer();
        dev.setDevName("From Software");
        
        GamesClass games = new GamesClass();
        games.setGamesName("Elden Ring");
        GamesClass games2 = new GamesClass();
        games2.setGamesName("Demon's Souls Remake");
        GamesClass games3 = new GamesClass();
        games3.setGamesName("Dark Souls Complete Edition");
        
        List<GamesClass> empList = new ArrayList<GamesClass>();
        /*Membuat list kosong pada GamesClass yang dipanggil
        dengan menggunakan List untuk diisi oleh atribut baru*/
        empList.add(games);
        empList.add(games2);
        empList.add(games3);
        
        dev.setDev(empList);
        System.out.println("============================================================================================");
        System.out.println(dev.getGames() + "are developed by" + dev.getDevName());
        System.out.println("============================================================================================");
    }
}
