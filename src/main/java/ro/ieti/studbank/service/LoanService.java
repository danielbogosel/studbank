package ro.ieti.studbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.Loans;
import ro.ieti.studbank.repository.LoanRepository;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    LoanRepository repository;

    public List<Loans> getLoanById(int id) {
        List<Loans> loans = repository.findByCustomerIdOrderByStartDtDesc(id);
        if (loans != null) {
            return loans;
        } else
            return null;
    }
}
