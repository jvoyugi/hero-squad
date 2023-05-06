package hero.squad.dao;

import java.util.List;

import hero.squad.models.Hero;

public interface HeroDAO {
    List<Hero> getAll();

    // CREATE
    void add(Hero hero);

    // READ
    Hero findById(int id);
     //DELETE
     void deleteById(int id);
     void clearAllHeroes();
}
