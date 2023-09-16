package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Getter
    @Setter
    @ManyToMany
    private Set<Address> addresses = new HashSet<>();

    @Getter
    @Setter
    @ManyToMany
    private Set<CreditCard> creditCards = new HashSet<>();
}
