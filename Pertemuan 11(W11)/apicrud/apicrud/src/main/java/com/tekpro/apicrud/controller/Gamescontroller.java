package com.tekpro.apicrud.controller;

/**
 *Kelompok 3 : 
 * - Delvito Rahim Derivansyah (211524039)
 * - Muhammad Rafi Farhan (211524051)
 * - Rachmat Purwa Saputra (211524054)
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekpro.apicrud.model.Games;
import com.tekpro.apicrud.service.GamesService;

@RestController
public class Gamescontroller{
   @Autowired
   GamesService gamesService;
   
    @GetMapping("/games")
    private List<Games> getAllGames(){
	return gamesService.getAllGames();
    }
        
    @GetMapping("/games/{id}")
    private Games getGames(@PathVariable("id") int id){
	return gamesService.getGamesById(id);
    }
    
    @DeleteMapping("/games/{id}")
    private void deleteGames(@PathVariable("id") int id){
	gamesService.delete(id);
    }
     
    @PostMapping("/games")
     private String saveGames(@RequestBody Games games){
	gamesService.saveOrUpdate(games);
        return games.getTitle();
    }   
    
     @PutMapping("/games")
     private Games update(@RequestBody Games games){
	gamesService.saveOrUpdate(games);
        return games;
    }   
     
     
}
