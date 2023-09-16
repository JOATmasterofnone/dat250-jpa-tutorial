package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import no.hvl.dat250.jpa.tutorial.creditcards.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.*;

public class CreditCardsMain {
  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {

    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
            PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      List<Object> createdObjects = createObjects(em);
      em.getTransaction().commit();
      //prettyPrintObjects(createdObjects);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void prettyPrintObjects(List<Object> createdObjects){
    for (Object obj : createdObjects) {
      if (obj != null) {
        System.out.println("Object type: " + obj.getClass().getName());
        System.out.println("Pretty Printed Object: ");
        System.out.println(obj.toString());

        String className = obj.getClass().getName();

        System.out.println("Object type: " + className);
        System.out.println("Pretty Printed Object: ");

          // Switch based on class name
          switch (className) {
              case "Address" -> {
                  // Handle YourClassType1
                  Address obj1 = (Address) obj;
                  System.out.println("Field1: " + obj1.getStreet());
              }
              case "CreditCard" -> {
                  // Handle YourClassType2
                  CreditCard obj2 = (CreditCard) obj;
                  System.out.println("Field2: " + obj2.getBank());
              }
              case "Customer" -> {
                  // Handle YourClassType3
                  Customer obj3 = (Customer) obj;
                  System.out.println("Field3: " + obj3.getName());
              }

              // Add more cases as needed
              default -> System.out.println("Unhandled object type");
          }
      }
    }
  }


  private static List<Object> createObjects(EntityManager em) {
    List<Object> createdObjects = new ArrayList<>();

    // Create and persist entities
    Customer customer = new Customer();
    customer.setName("Max Mustermann");

    Address address = new Address();
    address.setStreet("Inndalsveien");
    address.setNumber(28);

    Set<Address> addresses = new HashSet<>();
    addresses.add(address);
    customer.setAddresses(addresses);

    CreditCard card1 = new CreditCard();
    card1.setNumber(12345);
    card1.setBalance(-5000);
    card1.setCreditLimit(-10000);

    CreditCard card2 = new CreditCard();
    card2.setNumber(123);
    card2.setBalance(1);
    card2.setCreditLimit(2000);

    customer.getCreditCards().add(card1);
    customer.getCreditCards().add(card2);

    Pincode pincode = new Pincode();
    pincode.setCode("123");
    pincode.setCount(1);

    card1.setPincode(pincode);
    card2.setPincode(pincode);

    Bank bank = new Bank();
    bank.setName("Pengebank");
    bank.setOwnedCards(new HashSet<CreditCard>());
    bank.getOwnedCards().add(card1);
    bank.getOwnedCards().add(card2);

    card1.setBank(bank);
    card2.setBank(bank);

    em.persist(customer);
    createdObjects.add(customer);
    em.persist(address);
    createdObjects.add(address);
    em.persist(card1);
    createdObjects.add(card1);
    em.persist(card2);
    createdObjects.add(card2);
    em.persist(pincode);
    createdObjects.add(pincode);
    em.persist(bank);
    createdObjects.add(bank);

    return createdObjects;
  }
}
