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