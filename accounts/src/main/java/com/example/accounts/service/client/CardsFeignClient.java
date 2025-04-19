package com.example.accounts.service.client;

import com.example.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cards", path = "/api")
public interface CardsFeignClient {

    @GetMapping("/fetch")
    CardsDto fetchCardDetails(@RequestParam String mobileNumber);

}
