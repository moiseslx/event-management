package br.com.albuquerque.eventmanagement.repository;

import br.com.albuquerque.eventmanagement.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
