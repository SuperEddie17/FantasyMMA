package org.avc.controller;

import org.avc.DTO.EventDTO;
import org.avc.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("")
    public EventDTO newEvent(@RequestBody EventDTO eventDTO) {
        return eventService.newEvent(eventDTO);
    }

    @PutMapping("/{eventId}")
    public EventDTO editEvent(@RequestBody EventDTO eventDTO, @PathVariable Long eventId) {
        return eventService.editEvent(eventDTO, eventId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
    }

    @GetMapping("/{eventId}")
    public EventDTO getEvent(@PathVariable Long eventId) {
        return eventService.findEventById(eventId);

    }
}
