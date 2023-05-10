package com.ProjetoJava.Dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProjetoJava.Dslist.DTO.GameDTO;
import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.entities.Game;
import com.ProjetoJava.Dslist.repositories.GameRepository;

@Service 
public class GameService {

	@Autowired 
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> buscarTodosOsGames(){
		List<Game> listaGames = gameRepository.findAll();
		List<GameMinDTO> gamesDTO = listaGames.stream().map(x -> new GameMinDTO(x)).toList();
		return gamesDTO;
	}
	
	public GameDTO buscarPorId(Long id){
		Game resposta = gameRepository.findById(id).get();
		GameDTO gameDto = new GameDTO(resposta);
		return gameDto; 
	}
	
}
