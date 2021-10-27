package com.Discord.Bots;

import com.Discord.Bots.commands.Ping;
import com.Discord.Bots.secret.Token;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static String prefix=">";
    public static void main(String args[]){
        DiscordApi bot=new DiscordApiBuilder().setToken(Token.token).login().join();
        bot.addListener(new Ping());
        System.out.println("Bot is online "+"Owner of the server"+bot.getOwner());
    }
}
