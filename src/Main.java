
public class Main {
	public static void main(String [] args) {
        String initState = "initial State";
		GameBoard gameBoard = new GameBoard(initState);
		MatchView matchViewA  = new MatchView("MatchViewA");
        MatchView matchViewB  = new MatchView("MatchViewB");

        //subscribe the observer.
        gameBoard.subscribeObserver(matchViewA);
        gameBoard.subscribeObserver(matchViewB);

        // test for notify every Matchview Will know the initial state of gameBoard.
        gameBoard.notifyObserver();

		gameBoard.playMove();
		
	}
}
