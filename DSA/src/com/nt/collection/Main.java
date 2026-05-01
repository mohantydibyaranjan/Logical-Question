package com.nt.collection;

import java.util.*;

//Step 1: Implement the Comparable interface
class Player implements Comparable<Player> {
	private String name;
	private int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	// Step 2: Define the sorting logic
	@Override
	public int compareTo(Player other) {
		// Sort by score in ascending order
		if (this.score < other.score)
			return -1;
		if (this.score > other.score)
			return 1;
		return 0;

		// Shortcut: return this.score - other.score;
	}

	@Override
	public String toString() {
		return name + ": " + score;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Player> team = new ArrayList<>();
		team.add(new Player("Mario", 500));
		team.add(new Player("Luigi", 300));
		team.add(new Player("Peach", 450));

		// Step 3: Use Collections.sort()
		Collections.sort(team);

		System.out.println("Sorted by Score: " + team);
	}
}