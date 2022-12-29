package ro.ieti.studbank.service;

import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.AccountTransactions;
import ro.ieti.studbank.repository.AccountTransactionsRepository;

import java.util.List;

@Service
public class BalanceService {


    private AccountTransactionsRepository repository;

    public List<AccountTransactions> getBalance(int id) {
        List<AccountTransactions> transactions = repository.findByCustomerIdOrderByTransactionDtDesc(id);
        if (!transactions.isEmpty()) {
            return transactions;
        } else
            return null;
    }
}
