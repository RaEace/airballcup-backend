package airballcup.cup.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WinnersDTO {

    @JsonProperty("teamName")
    private String teamName;

    @JsonProperty("firstMember")
    private String firstMember;

    @JsonProperty("secondMember")
    private String secondMember;

    @JsonProperty("winDate")
    private Date date;

    @JsonProperty("photoUrl")
    private String photoUrl;
}
