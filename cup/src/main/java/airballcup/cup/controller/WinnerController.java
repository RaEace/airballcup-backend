package airballcup.cup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airballcup.cup.dto.WinnerDTO;
import airballcup.cup.entity.WinnerEntity;
import airballcup.cup.service.WinnerService;
import airballcup.cup.service.mapper.WinnerMapper;

@RestController
@RequestMapping("/winners")
public class WinnerController {

    @Autowired
    private WinnerService winnerService;

    @GetMapping
    public ResponseEntity<List<WinnerEntity>> getAllWinners() {
        List<WinnerEntity> allWinners = winnerService.getAllWinners();
        return ResponseEntity.ok(allWinners);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WinnerEntity> getWinner(@PathVariable Long id) {
        WinnerEntity winner = winnerService.getWinnerById(id);
        return ResponseEntity.ok(winner);
    }

    @PostMapping
    public ResponseEntity<WinnerEntity> createWinner(@RequestBody WinnerDTO winnerDTO) {
        WinnerEntity winner = WinnerMapper.mapDTOToEntity(winnerDTO);
        WinnerEntity savedWinner = winnerService.saveWinner(winner);
        return ResponseEntity.ok(savedWinner);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWinner(@PathVariable Long id) {
        winnerService.deleteWinner(id);
        return ResponseEntity.noContent().build();
    }
}
