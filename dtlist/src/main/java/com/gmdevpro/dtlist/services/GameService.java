package com.gmdevpro.dtlist.services;

import com.gmdevpro.dtlist.dto.GameMinDTO;
import com.gmdevpro.dtlist.entities.Game;
import com.gmdevpro.dtlist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findhAll() {
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }
}
