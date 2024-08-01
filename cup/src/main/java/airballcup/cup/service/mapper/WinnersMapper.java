package airballcup.cup.service.mapper;

import airballcup.cup.dto.WinnersDTO;
import airballcup.cup.entity.WinnersEntity;

public class WinnersMapper {

    public static WinnersEntity winnersDtoToEntity(WinnersDTO winnersDTO) {
        WinnersEntity winnersEntity = new WinnersEntity();
        winnersEntity.setTeamName(winnersDTO.getTeamName());
        winnersEntity.setMember1Name(winnersDTO.getFirstMember());
        winnersEntity.setMember2Name(winnersDTO.getSecondMember());
        winnersEntity.setDate(winnersDTO.getDate());
        winnersEntity.setPhotoUrl(winnersDTO.getPhotoUrl());
        return winnersEntity;
    }
}
