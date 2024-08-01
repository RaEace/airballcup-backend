package airballcup.cup.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WinnersDTO {

    @JsonProperty("team_name")
    private String teamName;

    @JsonProperty("member1_name")
    private String firstMember;

    @JsonProperty("member2_name")
    private String secondMember;

    @JsonProperty("win_date")
    private Date date;

    @JsonProperty("photo_url")
    private String photoUrl;
}
