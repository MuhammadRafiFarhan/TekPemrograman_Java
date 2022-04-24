package com.tekpro.apicrud.repository;

/**
 *Kelompok 3 : 
 * - Delvito Rahim Derivansyah (211524039)
 * - Muhammad Rafi Farhan (211524051)
 * - Rachmat Purwa Saputra (211524054)
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tekpro.apicrud.model.Games;
  
@Repository
public interface GamesRepository extends CrudRepository<Games, Integer>{

}
