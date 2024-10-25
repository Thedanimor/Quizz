package com.example.PrCarro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PrCarro.Model.Coche;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, String> {
}