package edu.javagroup.seabattle.controller.rest.impl;

import edu.javagroup.seabattle.controller.rest.GameController;
import edu.javagroup.seabattle.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/open/game")
public class GameControllerImpl implements GameController {

    private final GameService gameService;

    public GameControllerImpl(GameService gameService) {
        this.gameService = gameService;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public ResponseEntity<Boolean> lanTest() {
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> enemyReady() {
        return new ResponseEntity<>(gameService.enemyReady(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> enemySendBomb(int row, int col) {
        return new ResponseEntity<>(gameService.getBomb((char) row, col), HttpStatus.OK);
    }
}
