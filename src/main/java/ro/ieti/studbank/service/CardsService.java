package ro.ieti.studbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.Cards;
import ro.ieti.studbank.repository.CardsRepository;

import java.util.List;

@Service
public class CardsService {

    @Autowired
    private CardsRepository repository;

    public List<Cards> getCards(int id) {
        List<Cards> cards = repository.findByCustomerId(id);
        if (cards != null) {
            return cards;
        } else
            return null;
    }
}
