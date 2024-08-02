package airballcup.cup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airballcup.cup.dto.WinnersDTO;
import airballcup.cup.entity.WinnersEntity;
import airballcup.cup.service.WinnersService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/winners")
public class WinnersController {

    @Autowired
    private WinnersService winnersService;
    private static final Logger logger = LoggerFactory.getLogger(WinnersController.class);

    @GetMapping
    public ResponseEntity<List<WinnersEntity>> getAllWinners() throws Exception {
        List<WinnersEntity> allWinners = winnersService.getAllWinners();
        try {
            return ResponseEntity.ok(allWinners);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<WinnersEntity> getWinners(@PathVariable Long id) {
        WinnersEntity winners = winnersService.getWinnersById(id);

        try {
            return ResponseEntity.ok(winners);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping
    public ResponseEntity<WinnersEntity> createWinners(@RequestBody WinnersDTO winnersDTO) {
        WinnersEntity createdWinners = winnersService.createWinners(winnersDTO);

        try {
            return ResponseEntity.ok(createdWinners);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWinners(@PathVariable long id) {
        try {
            winnersService.deleteWinnersById(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
