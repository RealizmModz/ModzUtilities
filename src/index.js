const Discord = require('discord.js');
const config = require('./config.json');
const client = new Discord.Client();
client.commands = new Discord.Collection();
client.events = new Discord.Collection();

["EventHandler.js", "CommandHandler.js"].forEach(handler => 
    require(`./handlers/${handler}`)(client,Discord)
    );


client.login(config.token)