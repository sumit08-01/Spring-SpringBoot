package com.assignment5;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class PlayerConfig {

	@Bean(name = "p1")
	public Player getPlayer1() {
		List<Country> country  = List.of(new Country("IN101", "India"));
		Player player = new Player("R1001", "Rohit", country);
		return player;
		
	}
	
	@Bean(name = "p2")
	public Player getPlayer2() {
		List<Country> country  = List.of(new Country("IN101", "India"));
		Player player = new Player("V1001", "Virat", country);
		return player;
		
	}
	@Bean(name = "p3")
	public Player getPlayer3() {
		List<Country> country  = List.of(new Country("AUS201", "Australia "));
		Player player = new Player("AF1001", "AJ Finch", country);
		return player;
		
	}
	@Bean(name = "p4")
	public Player getPlayer4() {
		List<Country> country  = List.of(new Country("AUS201", "Australia "));
		Player player = new Player("DW1002", "DA Warne", country);
		return player;
		
	}
	@Bean(name = "p5")
	public Player getPlayer5() {
		List<Country> country  = List.of(new Country("AUS201", "Australia "));
		Player player = new Player("GM1003", "GJ Maxwell", country);
		return player;
		
	}
}
