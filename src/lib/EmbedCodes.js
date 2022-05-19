const { MessageEmbed, Message } = require('discord.js')

class ErrorEmbedCodes {
    constructor(type,msg,color) {
        this.type = type;
        this.msg = msg;
        this.color = color;
    }
};
