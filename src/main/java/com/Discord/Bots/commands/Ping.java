package com.Discord.Bots.commands;

import com.Discord.Bots.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Ping implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if(event.getMessageContent().equalsIgnoreCase(Main.prefix+"ping")){
            event.getChannel().sendMessage("Pong!");
        }
    }
}
