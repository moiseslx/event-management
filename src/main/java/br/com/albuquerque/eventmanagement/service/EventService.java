package br.com.albuquerque.eventmanagement.service;

import br.com.albuquerque.eventmanagement.model.Event;
import br.com.albuquerque.eventmanagement.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
    	this.eventRepository = eventRepository;
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public Event findById(Long id) {
        return eventRepository.findById(id).get();
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
