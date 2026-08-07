const amqb = require('amqplib');

const RABBITMQ_URL = "amqp://guest:guest@localhost:5672";
const QUEUE_NAME = "notification_queue";

let channel;

async function connectRabbitMQ() {
    const connection = await amqb.connect(RABBITMQ_URL);
    channel = await connection.createChannel();

    await channel.assertQueue(QUEUE_NAME,{
        durable: true
    });

    console.log("Worker connected to RabbitMQ...");
    
}

function getChannel(){
    return channel;
}

module.exports = {
    connectRabbitMQ,
    getChannel,
    QUEUE_NAME
}