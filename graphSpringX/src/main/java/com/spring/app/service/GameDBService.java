/**
 * 
 */
package com.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.GameDB;
import com.spring.app.repository.GameDBRepository;

/**
 * @author SRT
 *
 */
@Service
public class GameDBService implements GameDBRepository{

 

    @Autowired
    private GameDBRepository 
    gameDBRepository;
	
	@Override
	public List<GameDB> findAll() {
		// TODO Auto-generated method stub
        return (List<GameDB>) gameDBRepository.findAll();

	}

	@Override
	public <S extends GameDB> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GameDB> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameDB findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<GameDB> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GameDB entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends GameDB> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	 

 




}
