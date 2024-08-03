package airballcup.cup.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WinnerDTO {

    @JsonProperty("name")
    private String team;

    @JsonProperty("member1")
    private String member1;

    @JsonProperty("member2")
    private String member2;

    @JsonProperty("date")
    private LocalDate date;

    @JsonProperty("photoUrl")
    private String photoUrl;
}
