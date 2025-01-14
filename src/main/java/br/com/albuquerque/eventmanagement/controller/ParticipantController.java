package br.com.albuquerque.eventmanagement.controller;

import br.com.albuquerque.eventmanagement.model.Participant;
import br.com.albuquerque.eventmanagement.service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participants")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping
    public List<Participant> findAll() {
        return participantService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participant> findById(@PathVariable Long id) {
        return participantService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Participant save(@RequestBody Participant participant) {
        return participantService.save(participant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        participantService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
