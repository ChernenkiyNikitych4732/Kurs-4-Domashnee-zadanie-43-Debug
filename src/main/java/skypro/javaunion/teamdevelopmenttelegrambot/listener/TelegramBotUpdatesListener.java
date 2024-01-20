package skypro.javaunion.teamdevelopmenttelegrambot.listener;

import skypro.javaunion.teamdevelopmenttelegrambot.service.UserRequestService;
import com.pengrad.telegrambot.UpdatesListener;

import com.pengrad.telegrambot.model.Update;

import jakarta.annotation.PostConstruct;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Объект, уведомляемый о событии.
 * Он должен быть зарегистрирован источником событий
 * и реализовывать методы для получения и обработки уведомлений.
 */
@Component
public class TelegramBotUpdatesListener implements UpdatesListener {

    private final UserRequestService userRequestService;
    private final Logger logger = LoggerFactory.getLogger(TelegramBotUpdatesListener.class);

    public TelegramBotUpdatesListener(UserRequestService userRequestService) {
        this.userRequestService = userRequestService;
    }


    @Override
    public int process(List<Update> list) {
        return 0;
    }
}