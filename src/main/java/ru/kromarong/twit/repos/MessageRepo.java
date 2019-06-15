package ru.kromarong.twit.repos;

import org.springframework.data.repository.CrudRepository;
import ru.kromarong.twit.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
