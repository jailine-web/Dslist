package com.ProjetoJava.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoJava.Dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
