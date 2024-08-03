package airballcup.cup.service.mapper;

import airballcup.cup.dto.WinnerDTO;
import airballcup.cup.entity.WinnerEntity;

public class WinnerMapper {

    public static WinnerEntity mapDTOToEntity(WinnerDTO winnerDTO) {
        WinnerEntity winner = new WinnerEntity();
        winner.setTeam(winnerDTO.getTeam());
        winner.setMember1(winnerDTO.getMember1());
        winner.setMember2(winnerDTO.getMember2());
        winner.setDate(winnerDTO.getDate());
        winner.setPhotoUrl(winnerDTO.getPhotoUrl());
        return winner;
    }
}
