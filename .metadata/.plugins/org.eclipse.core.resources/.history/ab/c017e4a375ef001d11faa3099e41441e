package com.ProjetoJava.Dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoJava.Dslist.DTO.GameListDTO;
import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.services.GameListService;

@RestController// disponibiliza a API
@RequestMapping(value="/listas")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> buscarListas(){
		List<GameListDTO> games = gameListService.buscarTodosOsGames();
		return games;
	}
	
	
	
}
