package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // TODO: implement method!
    @Getter
    private Integer number;
    // TODO: implement method!
    @Getter
    private Integer creditLimit;
    private Integer name;
    // TODO: implement method!
    @Getter
    private Integer balance;

    public Bank getOwningBank() {
        // TODO: implement method!
        return null;
    }

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    // TODO: implement method!
    @Getter
    @ManyToOne
    @JoinColumn(name = "pincode_id")
    private Pincode pincode;

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
