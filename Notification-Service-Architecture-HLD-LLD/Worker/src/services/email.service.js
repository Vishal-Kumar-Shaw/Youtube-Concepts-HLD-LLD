const { sleep } = require('../utils/sleep');

async function sendEmail(order){
    console.log('-------------------------');
    console.log("Sending Email...");

    console.log(`sending email to ${order.email}`);
    console.log(`Subject : Order Confirmation`);
    await sleep(3000);
    if(order.email.includes('fail')){
        throw new Error('SMTP Server down');
    }
    console.log("✅ Email Sent Successfully");
}

module.exports = sendEmail;