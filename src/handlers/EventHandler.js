const fs = require('fs');
const { join } = require('path');

module.exports = (client, Discord) => {
    const load_dir = (dirs) => {
        debugger;
        const eventFiles = fs.readdirSync(join(__dirname, `../events/${dirs}`)).filter(file => file.endsWith(".js"))
        for(const file of eventFiles) {
            const event = require(`../events/${dirs}/${file}`);
            const eventName = file.split(".")[0];
            client.on(eventName, event.bind(null, Discord, client));
        }
    }
    ['client', 'guild'].forEach(e => load_dir(e))
}