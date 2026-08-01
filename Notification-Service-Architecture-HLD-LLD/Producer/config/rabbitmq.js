const amqp = require('amqplib');

const RABBITMQ_URL = 'amqp://guest:guest@localhost:5672';
const QUEUE_NAME = "notification_queue";
let channel;

async function connectRabbitMQ() {
    try{
        const connection = await amqp.connect(RABBITMQ_URL);
        console.log("Connected to RabbitMQ successfully...");

        channel = await connection.createChannel();

        console.log("Channel created successfully");

        await channel.assertQueue(QUEUE_NAME, {
            durable: true
        })
        console.log(`Queue '${QUEUE_NAME}' is ready`);

        connection.on("error",(err)=>{
            console.log("RabbitMQ connectionerror", err.message);
        })

        connection.on("close", ()=>{
            console.log("RabbitMQ Connection Closed");
        })


    }
    catch(err){
        console.error("Failed to connect:", err.message);
    }
}
function getChannel(){
    return channel;
}
module.exports = {
    connectRabbitMQ,
    getChannel,
    QUEUE_NAME
}
