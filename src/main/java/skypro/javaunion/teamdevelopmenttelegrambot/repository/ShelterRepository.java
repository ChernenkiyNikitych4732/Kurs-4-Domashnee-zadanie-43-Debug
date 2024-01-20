package skypro.javaunion.teamdevelopmenttelegrambot.repository;

import skypro.javaunion.teamdevelopmenttelegrambot.model.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends JpaRepository <Shelter, Long> {
}