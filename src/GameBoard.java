
public class GameBoard extends Subject  {
    private String state;
    public GameBoard(String state){
        this.state = state;
    }
    public String getState(){
        return "gameboard : current State = "+this.state;
    }
    public void playMove(){
        this.state = "playMove";
        this.notifyObserver();
    }

}
