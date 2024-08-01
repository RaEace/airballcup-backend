package airballcup.cup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import airballcup.cup.dto.WinnersDTO;
import airballcup.cup.entity.WinnersEntity;
import airballcup.cup.service.WinnersService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@RequestMapping("/winners")
public class WinnersController {

    @Autowired
    private WinnersService winnersService;

    @GetMapping
    public ResponseEntity<List<WinnersEntity>> getAllWinners() {
        List<WinnersEntity> allWinners = winnersService.getAllWinners();
        return ResponseEntity.ok(allWinners);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WinnersEntity> getWinners(@RequestParam Long id) {
        WinnersEntity winners = winnersService.getWinnersById(id);
        return ResponseEntity.ok(winners);
    }

    @PostMapping
    public ResponseEntity<WinnersEntity> createWinners(@RequestBody WinnersDTO winnersDTO) {
        WinnersEntity createdWinners = winnersService.createWinners(winnersDTO);
        return ResponseEntity.ok(createdWinners);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WinnersEntity> deleteWinners(long id) {
        winnersService.deleteWinnersById(id);
        return ResponseEntity.ok().build();
    }
}
