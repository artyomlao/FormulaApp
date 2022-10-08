package com.lepesha.formulaapp.service;

import com.lepesha.formulaapp.exception.UserNotFoundException;
import com.lepesha.formulaapp.model.Racer;
import com.lepesha.formulaapp.repository.RacerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RacerService {
    private final RacerRepository racerRepository;

    @Autowired
    public RacerService(RacerRepository racerRepository) {
        this.racerRepository = racerRepository;
    }

    public Racer add(Racer racer) {
        racer.setRacerCode(UUID.randomUUID().toString());
        return racerRepository.save(racer);
    }

    public List<Racer> findAllRacers(){
        return racerRepository.findAll();
    }

    public Racer findRacerById(Long id) throws Throwable {
        return racerRepository.findRacerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id "+ id + " wasn't found!"));
    }

    public Racer updateRacer(Racer racer){
        return racerRepository.save(racer);
    }

    public void deleteRacer(Long id){
        racerRepository.deleteRacerById(id);
    }
}
