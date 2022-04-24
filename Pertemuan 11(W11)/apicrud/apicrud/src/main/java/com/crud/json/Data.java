package com.crud.json;

import java.util.ArrayList;
import java.util.List;

import com.tekpro.apicrud.model.Games;

public class Data {
	private List<Games> games = new ArrayList<Games>();

	public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}
	
}
