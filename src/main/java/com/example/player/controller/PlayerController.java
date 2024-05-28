package com.example.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.player.Service.PlayerH2Service;
import com.example.player.model.Player;

@RestController
public class PlayerController {

    @Autowired
    public PlayerH2Service playerService;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }
}