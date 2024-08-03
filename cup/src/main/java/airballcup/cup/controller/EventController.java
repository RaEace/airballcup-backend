package airballcup.cup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import airballcup.cup.dto.EventDTO;
import airballcup.cup.entity.EventEntity;
import airballcup.cup.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<List<EventEntity>> getAllEvents() {
        List<EventEntity> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventEntity> getEvent(@RequestParam Long id) {
        EventEntity event = eventService.getEvent(id);
        return ResponseEntity.ok(event);
    }

    @PostMapping
    public ResponseEntity<EventEntity> createEvent(@RequestBody EventDTO eventDTO) {
        EventEntity createdEvent = eventService.createEvent(eventDTO);
        return ResponseEntity.ok(createdEvent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@RequestParam Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.ok().build();
    }
}
