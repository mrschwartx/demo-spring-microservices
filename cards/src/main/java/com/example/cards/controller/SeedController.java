package com.example.cards.controller;

import com.example.cards.entity.Cards;
import com.example.cards.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seeds")
@RequiredArgsConstructor
public class SeedController {

    private final CardsRepository cardsRepository;

    @GetMapping("/init")
    public ResponseEntity<List<Cards>> initializeCards() {
        List<Cards> cards = List.of();
        if (cardsRepository.count() > 0) {
            return ResponseEntity.ok(cards);
        }

        List<Cards> cardsList = List.of(
                new Cards(null, "0812345678", "4111111111111111", "Visa", 10000, 3000, 7000),
                new Cards(null, "0822334455", "5500000000000004", "MasterCard", 15000, 5000, 10000),
                new Cards(null, "0833445566", "340000000000009", "Amex", 12000, 2000, 10000)
        );

        cards = cardsRepository.saveAll(cardsList);

        return ResponseEntity.ok(cards);
    }

    @GetMapping("/clear")
    public String clearCards() {
        cardsRepository.deleteAll();
        return "🗑️ All cards deleted successfully.";
    }
}
