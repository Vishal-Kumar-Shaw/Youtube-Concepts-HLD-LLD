const { app }= require("./app");
const { connectRabbitMQ } = require('../config/rabbitmq');

const PORT = 3000;

app.listen(PORT, () => {
    connectRabbitMQ()
    console.log(`🚀 Server running on port ${PORT}`);
});