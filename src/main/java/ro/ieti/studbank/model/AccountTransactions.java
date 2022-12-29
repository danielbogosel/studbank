package ro.ieti.studbank.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "account_transactions")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransactions {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private int transactionAmt;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "create_dt")
    private String createDt;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "account_number",nullable = false)
    Accounts accounts;
}
