package airballcup.cup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airballcup.cup.dto.EventDTO;
import airballcup.cup.entity.EventEntity;
import airballcup.cup.repository.EventRepository;
import static airballcup.cup.service.mapper.EventMapper.mapDTOToEntity;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }

    public EventEntity getEvent(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public EventEntity createEvent(EventDTO eventDTO) {
        EventEntity eventEntity = mapDTOToEntity(eventDTO);
        return eventRepository.save(eventEntity);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

}
