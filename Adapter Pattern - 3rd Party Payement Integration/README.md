# Payment Gateway Adapter Pattern

A simple **plain Java** project demonstrating the **Adapter Design
Pattern** using a payment gateway example.

The goal is to understand how an application can work with different
third-party payment gateways without coupling the business/service layer
directly to any specific gateway.

## Project Structure

``` text
payment-adapter/
└── src/
    └── com.example.payment/
        ├── adapter/
        │   ├── PaymentProcessor.java
        │   └── RazorpayAdapter.java
        ├── gateway/
        │   └── Razorpay.java
        └── service/
            └── PaymentService.java
```

## Problem

Our application wants a common payment operation:

``` java
pay(double amount);
```

However, a third-party payment gateway may expose a different API.

For example, our fake Razorpay SDK exposes:

``` java
createOrder(double amount);
```

So we have two incompatible interfaces:

``` text
Our Application             Razorpay

pay(amount)        ≠        createOrder(amount)
```

If `PaymentService` directly depends on `Razorpay`, the service becomes
tightly coupled to Razorpay.

## Solution: Adapter Pattern

The Adapter Pattern allows an existing class with an incompatible
interface to work with the interface expected by our application.

``` text
PaymentService
      |
      v
PaymentProcessor
   <<interface>>
      ^
      |
RazorpayAdapter
      |
      v
  Razorpay
```

The adapter acts as a translator between our application's expected
interface and the third-party gateway's API.

## Key Components

### 1. PaymentProcessor

This is the interface expected by our application.

``` java
public interface PaymentProcessor {
    void pay(double amount);
}
```

### 2. Razorpay

This represents an existing third-party payment gateway.

``` java
public class Razorpay {

    public void createOrder(double amount) {
        System.out.println("Razorpay: Order created for ₹" + amount);
    }
}
```

Notice that Razorpay has `createOrder()` instead of `pay()`.

### 3. RazorpayAdapter

The adapter implements our application's interface and internally calls
Razorpay's API.

``` java
public class RazorpayAdapter implements PaymentProcessor {

    private Razorpay razorpay;

    public RazorpayAdapter(Razorpay razorpay) {
        this.razorpay = razorpay;
    }

    @Override
    public void pay(double amount) {
        razorpay.createOrder(amount);
    }
}
```

### 4. PaymentService

The service depends only on the `PaymentProcessor` interface.

``` java
public class PaymentService {

    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.pay(amount);
    }
}
```

This is the important part: `PaymentService` does **not** know that
Razorpay is being used.

## Running the Project

The application can be wired together in `Main.java`:

``` java
public class Main {

    public static void main(String[] args) {

        Razorpay razorpay = new Razorpay();

        RazorpayAdapter razorpayAdapter =
                new RazorpayAdapter(razorpay);

        PaymentService paymentService =
                new PaymentService(razorpayAdapter);

        paymentService.makePayment(1000);
    }
}
```

Expected output:

``` text
Razorpay: Order created for ₹1000.0
```

## Why Use the Adapter Pattern?

Without the adapter:

``` text
PaymentService
      |
      v
   Razorpay
```

`PaymentService` is tightly coupled to Razorpay.

With the adapter:

``` text
PaymentService
      |
      v
PaymentProcessor
      ^
      |
RazorpayAdapter
      |
      v
   Razorpay
```

Now `PaymentService` depends on an abstraction rather than a specific
payment provider.

This makes it easier to add another payment gateway later.

## Adding Another Gateway

Suppose Stripe has this API:

``` java
public class Stripe {

    public void charge(double amount) {
        System.out.println("Stripe: Charged ₹" + amount);
    }
}
```

We can create:

``` java
public class StripeAdapter implements PaymentProcessor {

    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        stripe.charge(amount);
    }
}
```

Now both gateways satisfy the same application-level contract:

``` text
                  PaymentProcessor
                         ^
                         |
              +----------+----------+
              |                     |
      RazorpayAdapter        StripeAdapter
              |                     |
          Razorpay               Stripe
```

`PaymentService` does not need to change.

## Key Takeaway

The main idea of the Adapter Pattern is:

> **Convert the interface of an existing class into the interface
> expected by the client.**

In this project:

``` text
Application expects:
    pay()

Razorpay provides:
    createOrder()

Adapter converts:
    pay() → createOrder()
```

The adapter keeps the application's core logic independent from the
details of the external API.

## Learning Goals

-   Understand the Adapter Design Pattern
-   Identify incompatible interfaces
-   Understand composition in an adapter
-   Reduce coupling between business logic and third-party APIs
-   Program against interfaces
-   Add new payment providers without changing `PaymentService`

## Future Improvements

This project can be extended by adding:

-   Stripe Adapter
-   PayPal Adapter
-   Payment status/result objects
-   Exception handling
-   Mock payment gateways
-   Dependency injection
-   Unit tests
-   Spring Boot implementation

The next natural step is to add **Stripe and PayPal adapters** and
demonstrate how the same `PaymentService` can work with multiple payment
gateways.
