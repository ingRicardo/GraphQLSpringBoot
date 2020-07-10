package com.spring.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.spring.app.model.GameDB;

@Repository
public interface GameDBRepository  extends CrudRepository<GameDB, Integer>{

}
