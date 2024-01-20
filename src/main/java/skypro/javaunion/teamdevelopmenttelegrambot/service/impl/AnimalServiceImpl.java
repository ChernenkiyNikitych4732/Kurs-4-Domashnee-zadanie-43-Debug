package skypro.javaunion.teamdevelopmenttelegrambot.service.impl;

import org.springframework.stereotype.Service;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.Color;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.Gender;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.PetType;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Animal;
import skypro.javaunion.teamdevelopmenttelegrambot.service.AnimalService;

import java.util.Collection;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Override
    public Animal saveAnimal(String nickName, PetType petType, Color color, Gender gender) {
        return null;
    }

    @Override
    public void updateAnimalById(Long id, String nickName, PetType petType, Color color, Gender gender) {

    }

    @Override
    public void deleteAnimalById(Long id) {

    }

    @Override
    public Collection<Animal> getAllAnimal() {
        return null;
    }
}
