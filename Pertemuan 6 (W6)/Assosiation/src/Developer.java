import java.util.List;

public class Developer {
    private String devName;
    List<GamesClass> games; 
    /*Array untuk memperbolehkan value
    duplicate pada index yang berbeda*/
    
    public String getDevName(){
        return devName;
    }
    public void setDevName(String devName){
        this.devName = devName;
    }
    public List<GamesClass> getGames(){
        return games;
}
    public void setDev(List<GamesClass> games){
        this.games = games;
}
}
