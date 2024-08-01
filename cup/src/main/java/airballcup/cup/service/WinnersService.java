package airballcup.cup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airballcup.cup.dto.WinnersDTO;
import airballcup.cup.entity.WinnersEntity;
import airballcup.cup.repository.WinnersRepository;
import airballcup.cup.service.mapper.WinnersMapper;

@Service
public class WinnersService {

    @Autowired
    private WinnersRepository winnersRepository;

    public List<WinnersEntity> getAllWinners() {
        return winnersRepository.findAll();
    }

    public WinnersEntity getWinnersById(Long id) {
        return winnersRepository.findById(id).orElse(null);
    }

    public WinnersEntity createWinners(WinnersDTO winnersDTO) {
        WinnersEntity winnersEntity = WinnersMapper.winnersDtoToEntity(winnersDTO);
        return winnersRepository.save(winnersEntity);
    }

    public void deleteWinnersById(long id) {
        winnersRepository.deleteById(id);
    }
}
