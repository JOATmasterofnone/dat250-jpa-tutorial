package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pincode {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private Integer count;

    public String getCode() {
        // TODO: implement method!
        return null;
    }

    public Integer getCount() {
        // TODO: implement method!
        return null;
    }

    public void setCode(String pincode) {
        this.pincode = pincode;
    }
}
