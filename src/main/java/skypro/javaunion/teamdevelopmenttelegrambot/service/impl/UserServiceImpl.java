package skypro.javaunion.teamdevelopmenttelegrambot.service.impl;

import org.springframework.stereotype.Service;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.ShelterType;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.UserStatus;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.UserType;
import skypro.javaunion.teamdevelopmenttelegrambot.model.User;
import skypro.javaunion.teamdevelopmenttelegrambot.service.UserService;

import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserByTelegramId(long userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User addUser(long telegramId, String nickName, UserType userType, UserStatus userStatus) {
        return null;
    }

    @Override
    public User addGuest(long telegramId, String nickName, UserType userType, ShelterType shelterType, UserStatus userStatus, String firstName, String lastName, String phoneNumber, String carNumber) {
        return null;
    }

    @Override
    public User addAdopterOrVolunteer(long telegramId, String nickName, UserType userType, ShelterType shelterType, UserStatus userStatus, String firstName, String lastName, String phoneNumber, String carNumber, String email, String address) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Collection<User> getAllUser() {
        return null;
    }

    @Override
    public void updateStatusUserById(Long id, UserStatus userStatus) {

    }
}
