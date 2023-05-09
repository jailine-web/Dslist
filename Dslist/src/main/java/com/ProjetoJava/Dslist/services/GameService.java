package com.ProjetoJava.Dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.entities.Game;
import com.ProjetoJava.Dslist.repositories.GameRepository;

@Service //registra a classe como um componente no sistema, ele pode injetar um componente no outro
public class GameService {

	@Autowired //injetando uma instância do gameRepository na classe gameService
	private GameRepository gameRepository;
	
	public List<GameMinDTO> buscarTodosOsGames(){
		List<Game> listaGames = gameRepository.findAll();
		List<GameMinDTO> gamesDTO = listaGames.stream().map(x -> new GameMinDTO(x)).toList();
		return gamesDTO;
	}
	
}
