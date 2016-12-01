package algo;

public class Game {

	public Game(Integer[] players1, Integer[] players2, int team1score, int team2score) {
		super();
		this.team1 = new Team(players1);
		this.team2 = new Team(players2);
		this.team1score = team1score;
		this.team2score = team2score;
	}
	
	public Game(Team team1, Team team2, int team1score, int team2score) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.team1score = team1score;
		this.team2score = team2score;
	}

	private Team team1;
	
	private Team team2;
	
	private int team1score;
	
	private int team2score;

	public int getTeam2score() {
		return team2score;
	}

	public void setTeam2score(int team2score) {
		this.team2score = team2score;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public int getTeam1score() {
		return team1score;
	}

	public void setTeam1score(int team1score) {
		this.team1score = team1score;
	}
}
