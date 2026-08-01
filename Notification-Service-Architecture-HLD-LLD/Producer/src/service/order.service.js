async function createOrder(body) {
    const order = {
        orderId: `ORD-${Date.now()}`,
        customerName: body.customerName,
        email: body.email,
        product: body.product,
        price: body.price,
        createdAt: new Date().toISOString()
    }
     // Simulate saving to database
    console.log("💾 Order Saved");

    // simulate the order
    console.log(order);

    return order;
}
module.exports = {
    createOrder
};