function sleep(ms){
    return new Promise(resolve => setTimeout(resolve,ms));
}
async function sendEmail(order) {
    console.log("----------------------")
    console.log("Sending confirmation email...");
    console.log(`To : ${order.email}`);
    await sleep(3000);
    throw new Error("SMTP Server is currently unavailable.");
}   

module.exports = {
    sendEmail
}