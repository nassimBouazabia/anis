package com.example.toto.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TotoService {

    @Autowired
    TotoRepository totoRepository;

    public Toto toUppercase(Toto toto){
        toto.setName(toto.getName().toUpperCase());
        toto.setLastName(toto.getLastName().toUpperCase());

        totoRepository.save(toto);
        return toto;
    }

    public Optional<Toto> get(String id) {
        return totoRepository.findById(id);
    }
}
