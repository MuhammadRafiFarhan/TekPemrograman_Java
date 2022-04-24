package com.tekpro.apicrud.service;

/**
 *Kelompok 3 : 
 * - Delvito Rahim Derivansyah (211524039)
 * - Muhammad Rafi Farhan (211524051)
 * - Rachmat Purwa Saputra (211524054)
 */

import java.util.List;
import java.util.ArrayList;

import com.tekpro.apicrud.model.Games;
import com.tekpro.apicrud.repository.GamesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService {
    @Autowired
    GamesRepository gamesRepository;
    
    public List<Games> getAllGames(){
        List<Games> games = new ArrayList<Games>();
        gamesRepository.findAll().forEach(games1 -> games.add(games1));
        return games;
	}
    
    public Games getGamesById(int id){
        return gamesRepository.findById(id).get();
    }
    
    public void saveOrUpdate(Games games){
        gamesRepository.save(games);
    }
    
    public void delete(int id){
        gamesRepository.deleteById(id);
    }
    
    public void update(Games games, int id){
        gamesRepository.save(games);
    }
    
}
    
    
