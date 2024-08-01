package airballcup.cup.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EventDTO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("date")
    private LocalDateTime date;
}
