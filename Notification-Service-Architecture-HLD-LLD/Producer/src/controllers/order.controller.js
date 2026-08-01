const orderService = require('../service/order.service')
async function createOrder(req, res){
    try{
        const order = await orderService.createOrder(req.body);
        return res.status(201).json({
            success: true,
            message: "Order Created Successfully",
            data: order
        })
    } catch(err){
        return res.status(500).json({
            success: false,
            message: err.message
        });
    }
}
module.exports = { createOrder };
