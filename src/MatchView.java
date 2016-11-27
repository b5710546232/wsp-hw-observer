
public class MatchView implements Observer {
	private String name;
	public MatchView(String name) {
		this.name = name;
	}
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		GameBoard gb = (GameBoard)subject;
		System.out.println(this.name+" get new state "+this.name +" "+gb.getState());
	
	}

}
