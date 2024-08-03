package airballcup.cup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airballcup.cup.entity.WinnerEntity;
import airballcup.cup.repository.WinnerRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class WinnerService {

    @Autowired
    private WinnerRepository winnerRepository;

    public List<WinnerEntity> getAllWinners() {
        return winnerRepository.findAll();
    }

    public WinnerEntity getWinnerById(Long id) {
        return winnerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("WinnerEntity not found"));
    }

    public WinnerEntity saveWinner(WinnerEntity winner) {
        return winnerRepository.save(winner);
    }

    public void deleteWinner(Long id) {
        winnerRepository.deleteById(id);
    }
}
