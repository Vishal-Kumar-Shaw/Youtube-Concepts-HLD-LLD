# E-Commerce Order Processing - Facade Pattern

A simple plain Java project demonstrating the **Facade Design Pattern** through an e-commerce order processing system.

This project shows how a client can become tightly coupled to multiple subsystems and how the **Facade Pattern** provides a single, simplified interface to coordinate the complete workflow.

---

## Problem

Placing an order in an e-commerce application involves multiple subsystems:

1. Checking product availability
2. Processing payment
3. Creating a shipment
4. Sending an order confirmation

Without a Facade, the client has to know about and coordinate every subsystem.

```text
Main
 ├── InventoryService
 ├── PaymentService
 ├── ShippingService
 └── NotificationService
```

The client is responsible for executing the workflow:

```text
Check Inventory
      ↓
Process Payment
      ↓
Create Shipment
      ↓
Send Confirmation
```

This creates several problems:

* The client knows too much about the internal system.
* Workflow logic is exposed to the client.
* The client is tightly coupled to multiple subsystems.
* Changes to the order workflow can require changes in multiple clients.
* The order processing flow can be duplicated across the application.

---

## Solution: Facade Pattern

The **Facade Pattern** provides a simple interface to a complex subsystem.

Instead of the client interacting with every service directly:

```text
Main
 │
 ▼
OrderFacade
 │
 ├── InventoryService
 ├── PaymentService
 ├── ShippingService
 └── NotificationService
```

The client only needs to interact with:

```text
OrderFacade.placeOrder(order)
```

The Facade handles the internal workflow.

---

## Project Structure

```text
ecommerce-facade/
└── src/
    └── com.example.ecommerce/
        │
        ├── model/
        │   └── Order.java
        │
        ├── inventory/
        │   └── InventoryService.java
        │
        ├── payment/
        │   └── PaymentService.java
        │
        ├── shipping/
        │   └── ShippingService.java
        │
        ├── notification/
        │   └── NotificationService.java
        │
        ├── facade/
        │   └── OrderFacade.java
        │
        └── Main.java
```

---

## Architecture

```text
                         Main
                          │
                          │ placeOrder(order)
                          ▼
                    OrderFacade
                          │
          ┌───────────────┼────────────────┐
          ▼               ▼                ▼
   InventoryService  PaymentService  ShippingService
          │               │                │
          └───────────────┴────────────────┘
                          │
                          ▼
                 NotificationService
```

`Main` does not need to know how each subsystem works.

---

## Order Processing Flow

The Facade coordinates the complete order processing workflow.

```text
placeOrder(order)
        │
        ▼
Check Inventory
        │
        ├── Not Available → Stop
        │
        ▼
Process Payment
        │
        ├── Failed → Stop
        │
        ▼
Create Shipment
        │
        ▼
Send Confirmation
        │
        ▼
Order Completed
```

---

## Key Components

### Order

Represents the information required to place an order.

Example fields:

```text
orderId
productId
amount
customerDetails
```

---

### InventoryService

Responsible only for inventory-related operations.

```text
checkAvailability(productId)
```

Returns whether the requested product is available.

---

### PaymentService

Responsible only for processing payments.

```text
processPayment(order)
```

Returns whether the payment was successful.

---

### ShippingService

Responsible for creating and managing shipments.

```text
createShipment(order)
```

---

### NotificationService

Responsible for notifying the customer about the order.

```text
sendConfirmation(order)
```

---

### OrderFacade

The Facade acts as a **single entry point** for order processing.

It coordinates all subsystems internally.

Conceptually:

```text
OrderFacade
    │
    ├── Check inventory
    │
    ├── Process payment
    │
    ├── Create shipment
    │
    └── Send confirmation
```

The client simply calls:

```java
orderFacade.placeOrder(order);
```

---

## Before vs After

### Without Facade

The client interacts with every subsystem directly.

```text
Main
 │
 ├── inventoryService.checkAvailability()
 │
 ├── paymentService.processPayment()
 │
 ├── shippingService.createShipment()
 │
 └── notificationService.sendConfirmation()
```

The client knows the complete workflow.

---

### With Facade

The client interacts with only one class.

```text
Main
 │
 ▼
orderFacade.placeOrder(order)
```

All internal coordination is hidden behind the Facade.

---

## Benefits

### 1. Simplified Client Interface

The client only needs one method:

```java
placeOrder(order);
```

---

### 2. Reduced Coupling

The client is no longer directly dependent on multiple subsystems.

```text
Before:

Main → InventoryService
Main → PaymentService
Main → ShippingService
Main → NotificationService
```

```text
After:

Main → OrderFacade → Subsystems
```

---

### 3. Centralized Workflow

The order processing sequence exists in one place.

If the workflow changes, such as adding fraud detection:

```text
Check Inventory
      ↓
Process Payment
      ↓
Fraud Detection
      ↓
Create Shipment
      ↓
Send Confirmation
```

The change can be handled inside the Facade without exposing the complexity to clients.

---

### 4. Easier to Use

Clients do not need to understand the interactions between individual subsystems.

They simply use:

```java
orderFacade.placeOrder(order);
```

---

## Key Takeaway

> **Facade Pattern provides a simple, unified interface to a set of complex subsystems.**

In this project:

```text
Client wants:

Place an Order
      │
      ▼
OrderFacade
      │
      ▼
Handles the complexity internally
```

The Facade does not necessarily replace the underlying services.

It simply provides a **convenient and simplified entry point** for using them together.

---

## Design Pattern Summary

```text
Problem:
Client has to interact with multiple complex subsystems.

Solution:
Provide a single Facade that coordinates those subsystems.

Result:
Client interacts with one simple interface instead of many services.
```

---

## Possible Improvements

This project can be extended by adding:

* Product catalog validation
* Fraud detection
* Payment failure handling
* Inventory reservation
* Order status tracking
* Logging
* Exception handling
* Refund workflow
* Multiple shipping providers
* Unit tests

---

## Commit History Concept

This project can demonstrate the evolution of the design through commits.

### Commit 1

```text
feat: implement order processing without facade
```

The client directly coordinates all subsystems.

### Commit 2

```text
refactor: introduce facade for simplified order processing
```

The workflow is moved into `OrderFacade`, providing the client with a simple interface.

---

## Interview Takeaway

If asked:

> **When should you use the Facade Pattern?**

A good answer is:

> Use the Facade Pattern when a subsystem is complex and clients should not need to know about or coordinate its internal components. A Facade provides a simplified, unified entry point while hiding the complexity behind it.
