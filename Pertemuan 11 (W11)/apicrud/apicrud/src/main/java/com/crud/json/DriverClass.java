package com.crud.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import com.tekpro.apicrud.model.Games;

public class DriverClass {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			Data result = gson.fromJson(new FileReader("D://data.json"), Data.class);
			for(Games games : result.getGames()) {
				System.out.println(games.toString());
			}
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}