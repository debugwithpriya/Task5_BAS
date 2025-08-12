# 🏦 Bank Account Management Console Application

A simple **Java console-based banking application** where users can create an account, deposit money, withdraw money, check their account balance, and view their transaction history.  
This project demonstrates **Object-Oriented Programming (OOP)** concepts such as **Encapsulation**, **Method-based operations**, and the use of **ArrayList** to store transaction history.

---

## 📌 Features

- **Create Account** – Initialize a new account by entering the account holder’s name.
- **Deposit Funds** – Add money to your account with validation.
- **Withdraw Funds** – Withdraw money only if enough balance is available.
- **Check Balance** – View your current balance without exposing it directly.
- **Transaction History** – View all deposits and withdrawals in order.
- **Menu-Driven Navigation** – User-friendly console-based interface.

---

## 🛠️ Technologies Used
- **Java** – Core programming language.
- **ArrayList** – Stores transaction history.
- **Scanner** – For console input handling.
- **OOP Principles** – Especially **Encapsulation** for data protection.

---
## 📂 Project Structure
src/
└── com.jsp.el/
├── Account.java # Encapsulated class handling account operations
└── App.java # Main class with menu-driven interaction

---

## 🔐 Encapsulation in This Project
Encapsulation is achieved by:
1. Declaring **`name`**, **`balance`**, and **`transactionHistory`** as `private`.
2. Providing **public getter methods** for controlled access.
3. Preventing direct modification of the balance outside the `deposit()` and `withdraw()` methods.
4. Applying **validation** inside methods to ensure only valid operations occur.

Example:
```java
private double balance;

public double getBalance() {
    return balance;
}
This ensures the balance can only be read, not changed, from outside the Account class.

🚀 How to Run
1. Clone the repository
git clone https://github.com/debugwithpriya/Task5_BAS

2. Navigate to the project folder
cd Task5_BAS

3.Compile the Java files
javac src/com/jsp/el/*.java

4. Run the application
java -cp src com.jsp.el.App

📸 Example Output
Enter account holder name: Priya Jain

==== Bank Menu ====
1. Deposit
2. Withdraw
3. Show Balance
4. Show Transaction History
5. Exit
Choose an option: 1
Enter deposit amount: 20000
Deposited rs.20000.0

==== Bank Menu ====
1. Deposit
2. Withdraw
3. Show Balance
4. Show Transaction History
5. Exit
Choose an option: 2
Enter withdrawal amount: 200
Withdraw rs.200.0

==== Bank Menu ====
1. Deposit
2. Withdraw
3. Show Balance
4. Show Transaction History
5. Exit
Choose an option: 3
Account Holder: Priya Jain
Current balance: rs.19800.0

==== Bank Menu ====
1. Deposit
2. Withdraw
3. Show Balance
4. Show Transaction History
5. Exit
Choose an option: 4

Transaction History:
Deposited rs.20000.0
Withdraw rs.200.0

==== Bank Menu ====
1. Deposit
2. Withdraw
3. Show Balance
4. Show Transaction History
5. Exit
Choose an option: 5
Thank you for using Elevate Lab bank app!




