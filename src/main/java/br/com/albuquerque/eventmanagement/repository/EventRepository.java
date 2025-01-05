package br.com.albuquerque.eventmanagement.repository;

import br.com.albuquerque.eventmanagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
