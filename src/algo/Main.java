package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		List<Game> games = app.initData();
		List<Integer> playes = Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5});
		Set<List<Integer>> result = app.calcOptimum(games, playes);
		
		int i = 1;
		for (List<Integer> team : result) {
			System.out.println("Team"+ (i++) +" "+team.toString());
		}
	}

	private Set<List<Integer>> calcOptimum(List<Game> games, List<Integer> playes) {
		Set<Integer> allPlayers = createListAllPlayers(games);
		
		List<Integer> team1 = new ArrayList<>();
		List<Integer> team2 = new ArrayList<>();
		
		team1.addAll(allPlayers);
		team2.addAll(allPlayers);
		
		Set<List<Integer>> result = new HashSet<>();
		result.add(team1);
		result.add(team2);
		
		return result;
	}
	
	private Set<Integer> createListAllPlayers(List<Game> games) {
		Set<Integer> players = new HashSet<>();

		for (Game game : games) {
			players.addAll(game.getTeam1().getPlayersAsSet());
			players.addAll(game.getTeam2().getPlayersAsSet());
		}
		return players;
	}

	private List<Game> initData() {
		List<Game> games = new ArrayList<>();
		games.add(new Game(new Integer[] {0, 1, 2}, new Integer[] {3, 4, 5}, 5, 2));
		games.add(new Game(new Integer[] {0, 1, 5}, new Integer[] {3, 4, 2}, 3, 2));
		games.add(new Game(new Integer[] {0, 3, 4}, new Integer[] {1, 2, 5}, 2, 4));
		return games;
	}
	
}
