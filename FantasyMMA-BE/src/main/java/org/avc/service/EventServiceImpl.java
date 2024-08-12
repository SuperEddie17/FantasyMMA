package org.avc.service;

import jakarta.persistence.EntityNotFoundException;
import org.avc.DTO.EventDTO;
import org.avc.DTO.mapper.EventMapper;
import org.avc.DTO.mapper.UserMapper;
import org.avc.entity.EventEntity;
import org.avc.entity.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public EventDTO newEvent(EventDTO eventDTO) {
        EventEntity eventEntity = eventMapper.toEntity(eventDTO);
        eventRepository.saveAndFlush(eventEntity);
        return eventMapper.toDTO(eventEntity);
    }

    @Override
    public EventDTO editEvent(EventDTO eventDTO, Long id) {
        EventEntity eventEntity = fetchEventById(id);
        eventMapper.updateEventEntity(eventDTO, eventEntity);
        eventRepository.saveAndFlush(eventEntity);

        return eventMapper.toDTO(eventEntity);
    }

    @Override
    public void deleteEvent(Long id) {
        EventEntity eventEntity = fetchEventById(id);
        eventRepository.deleteById(id);

    }

    @Override
    public EventDTO findEventById(Long id) {
        EventEntity eventEntity =fetchEventById(id);
        return eventMapper.toDTO(eventEntity);
    }

    private EventEntity fetchEventById(Long id) {
        return eventRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("User with ID " + id + " not found."));
    }
}