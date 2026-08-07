const {  getChannel, QUEUE_NAME } = require('../config/rabbitmq');

function startConsumer(){
    const channel = getChannel();

    console.log("Waiting for messages");
    channel.consume(QUEUE_NAME, (message) =>{
        const order = JSON.parse(message.content.toString());
        console.log('--------------------------');
        console.log('Order Received');
        console.log(order);
    })

}

module.exports={
    startConsumer
}