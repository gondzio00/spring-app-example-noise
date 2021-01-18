package com.example.noisyapp.controller;

import com.example.noisyapp.model.song.Song;
import com.example.noisyapp.model.song.SongRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnyController {

    SongRepository rep;

    AnyController(SongRepository rep){
        this.rep = rep;
    }

    @GetMapping("/public/songs")
    public List<Song> get(){

        return rep.findAll();
    }

}
