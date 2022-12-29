package ro.ieti.studbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ieti.studbank.model.Cards;
import ro.ieti.studbank.service.CardsService;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @GetMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestParam int id) {
        return cardsService.getCards(id);
    }
}
