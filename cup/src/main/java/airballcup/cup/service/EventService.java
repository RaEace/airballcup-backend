package airballcup.cup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import airballcup.cup.component.EventComponent;
import airballcup.cup.repository.EventRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public List<EventComponent> getAllEvent() {
        return eventRepository.findAll();
    }

    public EventComponent getEvent(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public EventComponent createEvent(EventComponent event) {
        return eventRepository.save(event);
    }

    public EventComponent updateEvent(Long id, EventComponent event) {
        EventComponent existingEvent = eventRepository.findById(id).orElse(null);

        if (existingEvent == null) {
            return null;
        }
        existingEvent.setEventName(event.getEventName());
        existingEvent.setEventDate(event.getEventDate());

        return eventRepository.save(existingEvent);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
