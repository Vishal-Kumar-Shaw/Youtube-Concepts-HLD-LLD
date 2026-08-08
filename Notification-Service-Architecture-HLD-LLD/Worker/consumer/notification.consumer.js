const {  getChannel, QUEUE_NAME } = require('../config/rabbitmq');
const sendEmail = require('../src/services/email.service');

function startConsumer(){
    const channel = getChannel();

    console.log("Waiting for messages");

    channel.consume(QUEUE_NAME, async (message) =>{
        const order = JSON.parse(message.content.toString());

        try{
            console.log("Notification received");
            await sendEmail(order);
            channel.ack(message);
            console.log("✅ Message Acknowledged");

        }catch(err){
            console.log(err.message);
        }
    })

}

module.exports={
    startConsumer
}