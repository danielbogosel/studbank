package ro.ieti.studbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.Accounts;
import ro.ieti.studbank.repository.AccountsRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountsRepository accountsRepository;

    public Accounts getAccountDetailsById(int id) {
        Accounts accounts = accountsRepository.findByCustomerId(id);
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }

    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }
}
