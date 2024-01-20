package skypro.javaunion.teamdevelopmenttelegrambot.service;

import skypro.javaunion.teamdevelopmenttelegrambot.constants.Color;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.PetType;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.Gender;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Adopter;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Animal;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

/**
 * Сервис по работе с животными.
 */
public interface AnimalService {

    /**
     * Сохраняем новое животное
     * @param nickName кличка
     * @param petType тип животного
     * @param color цвет
     * @param gender пол
     * @return сохраненное животное
     */
    Animal saveAnimal(String nickName,
                      PetType petType,
                      Color color,
                      Gender gender);

    /**
     * Изменяем параметры животного по идентификатору
     *
     * @param id идентификатор животного
     */
    void updateAnimalById(Long id,
                          String nickName,
                          PetType petType,
                          Color color,
                          Gender gender);

    /**
     * Удаляем животное по идентификатору
     *
     * @param id идентификатор животного
     */
    void deleteAnimalById(Long id);

    /**
     * Выводим всех животных
     *
     * @return список животных
     */
    Collection<Animal> getAllAnimal();
}