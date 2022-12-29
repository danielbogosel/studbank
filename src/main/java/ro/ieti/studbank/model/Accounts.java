package ro.ieti.studbank.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "accounts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {

    @Id
    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "create_dt")
    private String createdDt;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

}
