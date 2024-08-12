package org.avc.service;

import org.avc.DTO.EventDTO;

public interface EventService {

    EventDTO newEvent(EventDTO eventDTO);

    EventDTO editEvent(EventDTO eventDTO, Long id);

    void deleteEvent(Long id);

    EventDTO findEventById(Long id);
}
