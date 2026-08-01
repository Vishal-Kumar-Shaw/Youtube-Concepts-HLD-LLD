const express = require('express');
const app = express();
const orderRoutes = require('./routes/order.route')

app.use(express.json());

app.use('/orders', orderRoutes);
module.exports ={
     app
};