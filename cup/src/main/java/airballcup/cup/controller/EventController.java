package airballcup.cup.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airballcup.cup.component.EventComponent;
import airballcup.cup.service.EventService;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/")
    public List<EventComponent> getAllEvents() {
        return eventService.getAllEvent();
    }
}
