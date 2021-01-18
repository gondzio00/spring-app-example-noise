package com.example.noisyapp.controller;

import com.example.noisyapp.logic.SongService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    private SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

}
