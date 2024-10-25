package com.example.PrCarro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PrCarro.Model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
