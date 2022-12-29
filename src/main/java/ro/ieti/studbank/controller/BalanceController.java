package ro.ieti.studbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ieti.studbank.model.AccountTransactions;
import ro.ieti.studbank.service.BalanceService;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("/myBalance")
    public List<AccountTransactions> getBalanceById(@RequestParam int id) {
        return balanceService.getBalance(id);
    }
}
