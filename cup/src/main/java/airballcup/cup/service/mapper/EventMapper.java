package airballcup.cup.service.mapper;

import airballcup.cup.dto.EventDTO;
import airballcup.cup.entity.EventEntity;

public class EventMapper {

    public static EventEntity mapDTOToEntity(EventDTO eventDTO) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setName(eventDTO.getName());
        eventEntity.setDate(eventDTO.getDate());
        return eventEntity;
    }
}
