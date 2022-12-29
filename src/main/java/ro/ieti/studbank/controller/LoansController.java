package ro.ieti.studbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ieti.studbank.model.Loans;
import ro.ieti.studbank.service.LoanService;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestParam int id) {
        return loanService.getLoanById(id);
    }
}
