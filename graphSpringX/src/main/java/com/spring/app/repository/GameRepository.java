/**
 * 
 */
package com.spring.app.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.spring.app.model.Game;

/**
 * @author SRT
 *
 */
@Component
public class GameRepository {

	/**
	 * 
	 */
	  private Map<String, Game> games;

	  public GameRepository() {
	    games = new HashMap<>();
	  }

	  public Game save(Game game) {
	    String id = UUID.randomUUID().toString();

	    games.put(id, game);
	    game. setId(id);

	    return game;
	  }

	  public Game find(String id) {
	    return games.get(id);
	  }

}
