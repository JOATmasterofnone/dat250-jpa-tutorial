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

    @Getter
    @Setter
    private Integer number;

    @Getter
    @Setter
    private Integer creditLimit;

    @Getter
    @Setter
    private Integer name;

    @Getter
    @Setter
    private Integer balance;

    public Bank getOwningBank() {
        return bank;
    }

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;


    @Getter
    @Setter
    @ManyToOne
    private Pincode pincode;

}
