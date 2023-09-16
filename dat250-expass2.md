# Expass 2 Summary

## Technical Problems Encountered During Installation

I spent many days attempting to get JPA functioning in Eclipse since I already had it installed on my VM. I did not know how to fix the issue, so I resorted to installing IntelliJ as suggested by the TA in our lab this week. There were no issues encountered by doing that.

## No Issues With Java Persistence Architecture (JPA)

The only issue was that I didn't fully understand the task.  
Once I took the time to sit down and understand the material, there were no issues.

## Code and Test Cases

The link to my code for experiment 2 with passing test cases can be found [here](https://github.com/JOATmasterofnone/dat250-jpa-tutorial).

## Database Inspection

An explanation of how you inspected the database tables and what tables were created.

I used native SQL queries to print out the tables in the console

## Database Tables

```plaintext
Table: ADDRESS
NUMBER  ID  STREET  
28      1   Inndalsveien  
-----------------------------
Table: BANK
ID  NAME  
1   Pengebank  
-----------------------------
Table: CREDITCARD
BALANCE  CREDITLIMIT  NAME  NUMBER  BANK_ID  ID  PINCODE_ID  
-5000    -10000       null  12345   1        1   1  
1        2000         null  123     1        2   1  
-----------------------------
Table: CUSTOMER
ID  NAME  
1   Max Mustermann  
-----------------------------
Table: CUSTOMER_ADDRESS
ADDRESSES_ID  OWNERS_ID  
1             1  
-----------------------------
Table: CUSTOMER_CREDITCARD
CUSTOMER_ID  CREDITCARDS_ID  
1            1  
1            2  
-----------------------------
Table: CUSTOMER_CREDIT_CARD
CREDIT_CARD_ID  CUSTOMER_ID  
1               1  
2               1  
-----------------------------
Table: FAMILY
ID  DESCRIPTION  
-----------------------------
Table: JOB
SALARY  ID  JOBDESCR  
-----------------------------
Table: PERSON
FAMILY_ID  ID  FIRSTNAME  LASTNAME  
-----------------------------
Table: PERSON_JOB
PERSON_ID  JOBLIST_ID  
-----------------------------
Table: PINCODE
COUNT  ID  CODE  
1      1   123  
-----------------------------
Table: TODO
ID  DESCRIPTION  SUMMARY  
-----------------------------
```

## Pending Issues

- The code is quite messy and inconsistent; I would have fixed that if I had more time.
- There are extra tables created in the database. I did not have time to investigate how or why they exist.
