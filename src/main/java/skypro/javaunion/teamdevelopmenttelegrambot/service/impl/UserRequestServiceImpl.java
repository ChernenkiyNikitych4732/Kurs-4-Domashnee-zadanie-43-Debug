package skypro.javaunion.teamdevelopmenttelegrambot.service.impl;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Service;
import skypro.javaunion.teamdevelopmenttelegrambot.service.UserRequestService;

@Service
public class UserRequestServiceImpl implements UserRequestService {

    @Override
    public boolean checkReport(Update update) {
        return false;
    }

    @Override
    public boolean checkVolunteer(Update update) {
        return false;
    }

    @Override
    public boolean checkAdopter(Update update) {
        return false;
    }

    @Override
    public boolean checkUserInGuestCat(Update update) {
        return false;
    }

    @Override
    public boolean checkUserInGuestDog(Update update) {
        return false;
    }

    @Override
    public void sendMessageStart(Update update) {

    }

    @Override
    public void createButtonClick(Update update) {

    }
}
