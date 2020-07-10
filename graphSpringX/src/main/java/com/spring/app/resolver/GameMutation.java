/**
 * 
 */
package com.spring.app.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.app.model.Game;
import com.spring.app.model.GameDB;
import com.spring.app.repository.GameDBRepository;
import com.spring.app.repository.GameRepository;

import javassist.NotFoundException;

/**
 * @author SRT
 *
 */
@Component
public class GameMutation implements GraphQLMutationResolver {

	  @Autowired
	  private GameRepository gameRepository;

	  @Autowired
	  private GameDBRepository gameDBRepository;
	  
	  public Game newGame(String name, Integer cost) {
	    Game game = new Game();
	    game.setName(name);
	    game.setCost(cost);

	    return gameRepository.save(game);
	  }
	  
	  public GameDB createGameDB(String name, Double cost, String category) {
		    GameDB gamedb = new GameDB();
		    
		    gamedb.setName(name);
		    gamedb.setCost(cost);
		    gamedb.setCategory(category);
		    gameDBRepository.save(gamedb);

		    return gamedb;
		  }
	  
	  public GameDB updateGameDB(int id, String name, Double cost ,String category) throws NotFoundException {
		    Optional<GameDB> optGameDB = Optional.ofNullable(gameDBRepository.findOne(id));

		    if (optGameDB.isPresent()) {
		    	GameDB game = optGameDB.get();

		      if (name != null)
		        game.setName(name);
		      if(cost !=null)
		    	  game.setCost(cost);
		      if (category != null)
		    	  game.setCategory(category);
		        

		      gameDBRepository.save(game);
		      return game;
		    }

		    throw new NotFoundException("Not found Tutorial to update!");
		  }
	  
}
