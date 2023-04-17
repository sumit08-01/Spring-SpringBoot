package com.assignment5;

import java.util.List;

public class Player {

	private String playerId;
	private String playerName;
	private List<Country> country;
	
	public Player() {
	}

	public Player(String playerId, String playerName, List<Country> country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	}
	
	
	
	
	
}
