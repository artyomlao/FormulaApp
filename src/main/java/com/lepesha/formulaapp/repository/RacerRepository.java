package com.lepesha.formulaapp.repository;

import com.lepesha.formulaapp.model.Racer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RacerRepository extends JpaRepository<Racer, Repository>{

    void deleteRacerById(Long id);

    Optional<Racer> findRacerById(Long id);
}
