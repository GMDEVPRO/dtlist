package com.gmdevpro.dtlist.controllers;

import com.gmdevpro.dtlist.dto.GameMinDTO;
import com.gmdevpro.dtlist.entities.Game;
import com.gmdevpro.dtlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

@GetMapping
  public List<GameMinDTO> findAll() {
     List<GameMinDTO> result = gameService.findhAll();
     return result;
  }
}
