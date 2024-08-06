package ru.spring.datajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spring.datajpa.models.Item;
import ru.spring.datajpa.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {

    // Кастомные методы
    List<Item> findByOwner(Person owner);

    List<Item> findByItemName(String itemName);
}
