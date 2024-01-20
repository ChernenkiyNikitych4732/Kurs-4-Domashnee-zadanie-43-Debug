package skypro.javaunion.teamdevelopmenttelegrambot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.generics.TelegramBot;

/**
 * Описание сущности, с которой будет работать Telegram Bot
 */
@Configuration
public class BotConfig {

    public BotConfig() {
    }

    @Bean
    public TelegramBot telegramBot() {

        return new TelegramBot() {
            @Override
            public String getBotUsername() {
                return null;
            }

            @Override
            public String getBotToken() {
                return null;
            }
        };

    }
}