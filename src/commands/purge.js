const { MessageEmbed } = require("discord.js");
module.exports = {
    name: "purge",
    description: "Delete multiple commands at once",
    cooldown: 5,
    permissions: ["SEND_MESSAGES"],
    botpermissions: [],
    execute(client, message, args, Discord) {
        let quantity = args[1];

        if (isNaN(quantity)) {
            
        }
    }
}