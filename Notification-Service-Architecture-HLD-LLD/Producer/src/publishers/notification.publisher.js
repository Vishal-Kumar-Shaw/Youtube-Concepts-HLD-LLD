const { getChannel, QUEUE_NAME } = require('../../config/rabbitmq');

async function publishOrderEvent(order){
    const channel = getChannel();
    channel.sendToQueue(
        QUEUE_NAME,
        Buffer.from(JSON.stringify(order),
            {
                presistent: true
            }
        )
    )
    console.log("📤 Order Event Published");
}
module.exports = { publishOrderEvent };