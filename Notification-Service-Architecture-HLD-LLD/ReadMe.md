# Notification Service

## Phase 1 - Synchronous Architecture

### Commit 1

Initialized the Express application.

Current Architecture

Client

↓

Express Server



# Commit 2 - Add Synchronous Order Creation Endpoint

## Objective

Implement a basic Order API using a layered architecture.

At this stage:
- Accept order requests
- Simulate saving the order
- Return success response
- No notification logic yet

---

## Architecture

```text
Client
   │
POST /orders
   │
   ▼
Order Controller
   │
   ▼
Order Service
   │
   ▼
Save Order (Simulated)
   │
   ▼
HTTP Response (201 Created)
```

---

## Folder Structure

```text
src/
│
├── app.js
├── server.js
│
├── routes/
│   └── order.routes.js
│
├── controllers/
│   └── order.controller.js
│
└── services/
    └── order.service.js
```

---

## API

### Create Order

**POST** `/orders`

Request

```json
{
  "customerName": "Vishal Kumar Shaw",
  "email": "vishal@gmail.com",
  "product": "MacBook Pro",
  "price": 200000
}
```

Response

```json
{
  "success": true,
  "message": "Order created successfully",
  "data": {
    "orderId": "ORD-1754051234567",
    "customerName": "Vishal Kumar Shaw",
    "email": "vishal@gmail.com",
    "product": "MacBook Pro",
    "price": 200000,
    "createdAt": "2026-08-01T..."
  }
}
```

---

## Current Flow

1. Client sends a request to create an order.
2. The request reaches the Controller.
3. The Controller delegates the work to the Service.
4. The Service simulates saving the order.
5. The API returns a success response.

---

## Limitations

Currently, the application only creates an order.

There is no notification mechanism.


# Commit 3 - Send Confirmation Email Synchronously

## Objective

Send a confirmation email immediately after creating an order.

## Updated Architecture

```text
Client
   │
POST /orders
   │
   ▼
Order Controller
   │
   ▼
Order Service
   │
   ├── Save Order
   │
   └── Send Email
           │
           ▼
      SMTP Server
           │
           ▼
HTTP Response
```

## Observation

The client does not receive a response until the email has been sent.

Although the order is already created, the API remains blocked while waiting for the notification process to complete.

This increases response time and tightly couples order creation with email delivery.

# Commit 4 - Simulate Email Service Failure

## Objective

Simulate a failure in the email service to understand the drawbacks of synchronous communication.

## Current Flow

```text
Client
   │
POST /orders
   │
   ▼
Order Controller
   │
   ▼
Order Service
   │
   ├── Save Order ✅
   │
   └── Send Email ❌
           │
           ▼
HTTP 500 Response
```

## Problem

The order is successfully created, but because the email service fails, the entire API returns an error.

This tightly couples the order creation process with the notification process.

A failure in one downstream dependency causes the entire request to fail.

## Motivation

Order creation and notification should be independent.

The customer should receive a successful response as soon as the order is created, while notifications should be processed asynchronously in the background.

# Commit 5 - Add RabbitMQ Infrastructure

## Objective

Introduce RabbitMQ into the project using Docker.

At this stage, RabbitMQ is running but is not yet integrated with the application.

## Why?

Before refactoring the application to asynchronous communication, we first need a message broker capable of receiving and storing events.

## Current Architecture

```text
Client
   │
POST /orders
   │
   ▼
Order Service
   │
   ▼
Email Service

RabbitMQ (Running but not connected)
```

## RabbitMQ Management UI

```
http://localhost:15672
```

Default Credentials

```
Username : guest

Password : guest
```

No queues have been created yet.