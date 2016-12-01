package algo;

import java.util.HashSet;
import java.util.Set;

public class Team {
	
	private Integer[] players;

	public Team(Integer... players) {
		this.players = players; 
	}
	
	public Integer[] getPlayers() {
		return players;
	}

	public Set<Integer> getPlayersAsSet() {
		Set<Integer> result = new HashSet<>();
		for (Integer player : players) {
			result.add(player);
		}
		return result;
	}

	public void setPlayers(Integer[] players) {
		this.players = players;
	}
}
