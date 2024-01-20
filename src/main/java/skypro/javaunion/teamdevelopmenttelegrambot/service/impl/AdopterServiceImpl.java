package skypro.javaunion.teamdevelopmenttelegrambot.service.impl;

import org.springframework.stereotype.Service;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Adopter;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Animal;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Shelter;
import skypro.javaunion.teamdevelopmenttelegrambot.model.User;
import skypro.javaunion.teamdevelopmenttelegrambot.service.AdopterService;

import java.util.Collection;

@Service
public class AdopterServiceImpl implements AdopterService {
    @Override
    public Adopter saveAdopter(Adopter adopter) {
        return null;
    }

    @Override
    public void updateAdopterById(Long id, User user, Animal animal, Shelter shelter) {

    }

    @Override
    public void deleteAdopterById(Long id) {

    }

    @Override
    public Collection<Adopter> getAllAdopter() {
        return null;
    }

    @Override
    public Adopter foundAdopterById(long id) {
        return null;
    }
}
