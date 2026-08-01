function sleep(ms){
    return new Promise(resolve => setTimeout(resolve,ms));
}
async function sendEmail(order) {
    console.log("----------------------")
    console.log("Sending confirmation email...")
    await sleep(2000);
    console.log("Email notification sent successfully");
}   

module.exports = {
    sendEmail
}