# Stock Trading Platform

## Overview

The Stock Trading Platform is a console-based Java application that simulates basic stock market trading. Users can view available stocks, buy and sell shares, manage their portfolio, and track transaction history. The project demonstrates the use of Java Collections Framework, OOP principles and menu-driven programming.

## Features

* View available market stocks and prices
* Buy stocks based on available balance
* Sell owned stocks
* Manage investment portfolio
* Track account balance
* View transaction history
* Calculate portfolio value
* Calculate net worth
* Input validation and error handling

## Technologies Used

* Java
* HashMap
* ArrayList
* Scanner Class
* Object-Oriented Programming (OOP)

## Data Structures Used

### HashMap

Used to store market stock prices:

```java
HashMap<String, Double> market
```

Used to store portfolio holdings:

```java
HashMap<String, Integer> portfolio
```

### ArrayList

Used to store transaction history:

```java
ArrayList<String> history
```

## Project Structure

```text
StockTradingPlatform/
│
├── StockTradingPlatform.java
├── README.md
└── screenshots/
```

## How to Run

### Compile

```bash
javac StockTradingPlatform.java
```

### Execute

```bash
java StockTradingPlatform
```

## Menu Options

1. View Market
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. Transaction History
6. Exit

## Sample Stocks

| Stock | Price |
| ----- | ----- |
| TCS   | ₹3500 |
| INFY  | ₹1600 |
| WIPRO | ₹500  |
| HCL   | ₹1400 |
| TECHM | ₹1700 |

## Sample Output

```text
===== STOCK TRADING PLATFORM =====

Balance : ₹100000

1. View Market
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. Transaction History
6. Exit

Enter Choice: 2

Enter Stock Name: TCS
Enter Quantity: 5

Stock Purchased Successfully!
```

## Time Complexity

| Operation        | Complexity |
| ---------------- | ---------- |
| Buy Stock        | O(1)       |
| Sell Stock       | O(1)       |
| Search Portfolio | O(1)       |
| View Market      | O(n)       |
| View Portfolio   | O(n)       |
| View History     | O(n)       |

## Learning Outcomes

* Java Collections Framework
* HashMap Operations
* ArrayList Operations
* Menu-Driven Programming
* Portfolio Management Logic
* Transaction Tracking
* Time Complexity Analysis

  
## Author

Sathish Chekuri
