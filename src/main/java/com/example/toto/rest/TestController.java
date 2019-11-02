package com.example.toto.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/toto")
public class TestController {

    @Autowired
    TotoService totoService;

    @GetMapping("/{id}")
    public Optional<Toto> getToto(@PathVariable String id){
        return totoService.get(id);
    }

    @PostMapping
    public Toto postToto(@RequestBody Toto toto){
        return totoService.toUppercase(toto);
    }
}
