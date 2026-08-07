const { connectRabbitMQ } = require('../config/rabbitmq');
const { startConsumer } = require('../consumer/notification.consumer');

async function bootstrap(){
    await connectRabbitMQ();
    await startConsumer();
}
bootstrap();