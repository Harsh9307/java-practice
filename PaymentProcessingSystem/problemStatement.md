# Problem: Implement a Payment Processing System using Strategy Pattern

## Overview

You are building an e-commerce checkout system that supports multiple payment methods. The system must allow new payment methods to be added without modifying existing business logic, following the **Strategy Design Pattern**.

---

## Requirements

### 1. Strategy Interface

Define a `PaymentStrategy` interface with the following method:

```
pay(amount)
```

---

### 2. Concrete Strategies

Implement at least three payment strategies:

* `CreditCardPayment`
* `UPIPayment`
* `CryptoPayment`

Each strategy must provide its own implementation of the `pay(amount)` method.

---

### 3. Context Class

Create a `PaymentContext` (or `Checkout`) class that:

* Accepts a `PaymentStrategy` at runtime
* Delegates the payment processing to the selected strategy by calling its `pay(amount)` method

The context should remain unchanged when new payment methods are introduced.

---

## Functional Constraints

* Amount must be validated (no zero or negative values allowed)
* Each strategy should simulate different processing logic, such as:

  * Logging
  * Transaction fees
  * Validation rules
* The checkout flow must not change when adding new payment methods

---

## Edge Cases to Handle

* Attempting to make a payment without setting a strategy
* Invalid payment amounts (zero or negative)
* Switching strategies during the checkout process

---

## Sample Output

```
Payment Method: Credit Card
Amount: 2500
Processing credit card payment...
Payment successful.
```

---

## Objective

Design the system in such a way that:

* New payment methods can be added easily
* No conditional logic like `if-else` or `switch` based on payment type exists in the checkout class
* The Strategy Pattern is properly followed

---

## Bonus Challenge

Add a new payment method such as `NetBankingPayment` without changing the existing checkout or context logic.
