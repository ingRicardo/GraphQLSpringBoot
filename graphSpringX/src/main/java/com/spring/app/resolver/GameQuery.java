/**
 * 
 */
package com.spring.app.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.app.model.Game;
import com.spring.app.model.GameDB;
import com.spring.app.repository.GameRepository;
import com.spring.app.service.GameDBService;
 
/**
 * @author SRT
 *
 */
@Component
public class GameQuery implements GraphQLQueryResolver{

	/**
	 * 
	 */
	  @Autowired
	  private GameRepository gameRepository;

	  @Autowired
	  private GameDBService gameDBService;
	  
	  public Game getGame(String id) {
	    return gameRepository.find(id);
	  }
	  
 
	  Iterable<GameDB> findAllGamesDB() {
	        return gameDBService.findAll();
	    }
	  
}
