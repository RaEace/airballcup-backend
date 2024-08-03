package airballcup.cup.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PhotoDTO {

    @JsonProperty("url")
    private String url;

    @JsonProperty("date")
    private LocalDateTime date;
}
