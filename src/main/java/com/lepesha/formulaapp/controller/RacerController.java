package com.lepesha.formulaapp.controller;

import com.lepesha.formulaapp.model.Racer;
import com.lepesha.formulaapp.service.RacerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/racer")
public class RacerController {
    private final RacerService racerService;

    @Autowired
    public RacerController(RacerService racerService) {
        this.racerService = racerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Racer>> getAllRacers() {
        List<Racer> racers = racerService.findAllRacers();
        return new ResponseEntity<>(racers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Racer> getRacerById(@PathVariable("id") Long id) throws Throwable {
        Racer racer = racerService.findRacerById(id);
        return new ResponseEntity<>(racer, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Racer> addRacer(@RequestBody Racer racer) {
        Racer newRacer = racerService.add(racer);
        return new ResponseEntity<>(newRacer, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Racer> updateRacer(@RequestBody Racer racer) {
        Racer newRacer = racerService.updateRacer(racer);
        return new ResponseEntity<>(newRacer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRacer(@PathVariable Long id) {
        racerService.deleteRacer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
