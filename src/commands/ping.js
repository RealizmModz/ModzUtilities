const { MessageEmbed } = require("discord.js");

module.exports = {
    name: 'ping',
    description: 'The Bots Latency',
    cooldown: 0.5,
    permissions: [],
    botpermissions: [],
    execute(client, message, args, Discord) {

        message.channel.send(new MessageEmbed()
            .setTitle("Bot Latency")
            .setDescription(`Command sent by ${message.author.tag}`)
            .addField("Bot Latency", client.ws.ping)
        )
    }
}