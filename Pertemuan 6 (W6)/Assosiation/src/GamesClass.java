import java.util.*;

public class GamesClass {
    private String gamesName;
    
    public String getGamesname(){
        return gamesName;
    }
    public void setGamesName(String gamesName){
        this.gamesName = gamesName;
    }
    
@Override
public String toString(){
/*method untuk melakukan representasi data
ke dalam string saat proses override*/
    return gamesName;
}
}
