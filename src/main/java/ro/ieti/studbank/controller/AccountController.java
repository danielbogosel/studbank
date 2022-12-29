package ro.ieti.studbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ieti.studbank.model.Accounts;
import ro.ieti.studbank.service.AccountService;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam int id) {
        return accountService.getAccountDetailsById(id);
    }

    @GetMapping("/allAccounts")
    public List<Accounts> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
