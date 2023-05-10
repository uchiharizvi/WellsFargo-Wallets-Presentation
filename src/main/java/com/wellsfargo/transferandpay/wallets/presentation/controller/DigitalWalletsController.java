package com.wellsfargo.transferandpay.wallets.presentation.controller;

import com.wellsfargo.transferandpay.wallets.presentation.service.EligibleCardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/wallets/v1")
public class DigitalWalletsController {
    @Autowired
    private EligibleCardsService eligibleCardsService;
    @GetMapping("/card/eligibleCards")
    public String getEligibleCards() throws Exception {
        return eligibleCardsService.viewEligibleCards();
    }
    @PostMapping("/card/eligibleCards")
    public String addCardToWallet(){
        return "";
    }
    @GetMapping("/card/eligibleCards")
    public String removeCardFromWallet(){
        return "";
    }
}
