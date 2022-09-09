package edu.javagroup.seabattle.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface GameController {

    @GetMapping("/lanTest")
    ResponseEntity<Boolean> lanTest();

    /**
     * враг проверяет готовность
     */
    @GetMapping("/imEnemyAndImReady")
    ResponseEntity<Boolean> enemyReady();

    /**
     * враг отправляет бомбу
     */
    @PostMapping("/imEnemyAndISendBomb")
    ResponseEntity<Boolean> enemySendBomb(@RequestParam("row") int row, @RequestParam("col") int col);
}
