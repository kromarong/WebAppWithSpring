package ru.kromarong.twit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.twit.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
