package br.com.albuquerque.eventmanagement.service;

import br.com.albuquerque.eventmanagement.model.Participant;
import br.com.albuquerque.eventmanagement.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
    	this.participantRepository = participantRepository;
    }

    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    public Participant findById(Long id) {
        return participantRepository.findById(id).get();
    }

    public List<Participant> findAll() {
        return participantRepository.findAll();
    }
}
