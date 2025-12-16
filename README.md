# Banking Service – Technical Test

## 📌 Overview

This project is a simple banking service implemented in Java as part of a technical test.

The goal is to model the core behavior of a bank account:

* Deposit money
* Withdraw money
* Store transaction history

The implementation follows  basic object-oriented design, and respects all constraints defined in the test instructions.

---

## 🧰 Tech Stack

* **Java**: OpenJDK 21
* **Build Tool**: IntelliJ IDEA 
* **Data Storage**: In-memory (`ArrayList`)


## Design Explanation

### Account

The `Account` class represents a bank account and is responsible for:

* Managing the current balance
* Recording all transactions
* Applying business rules (validation, insufficient funds)
* Printing the bank statement

### Transaction

The `Transaction` class is an immutable data object that represents a single operation on the account.

Each transaction stores:

* Date of operation
* Amount (positive for deposit, negative for withdrawal)
* Balance after the operation

This separation reflects real-world banking systems and improves clarity and maintainability.

---

##  How to Run the Project

1. Open the project in **IntelliJ IDEA**
2. Ensure **JDK 21** is configured
3. Run the `Main` class

---
