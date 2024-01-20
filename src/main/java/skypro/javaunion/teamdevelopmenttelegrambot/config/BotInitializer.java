package skypro.javaunion.teamdevelopmenttelegrambot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.generics.TelegramBot;

@Slf4j
@Component
public class BotInitializer {
    final TelegramBot bot;

    public BotInitializer(TelegramBot bot) {
        this.bot = bot;
        System.out.println("Приют для кошек и собак !");
    }
}