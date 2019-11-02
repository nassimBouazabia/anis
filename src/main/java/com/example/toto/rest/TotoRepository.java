package com.example.toto.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TotoRepository extends JpaRepository<Toto,String> {
}
