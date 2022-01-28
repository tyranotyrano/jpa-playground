package com.tyranotyrano.domain;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.PersistenceContext;

import org.hibernate.service.spi.InjectService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.tyranotyrano.domain.repository.UserRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class UserTest {

    @Autowired
    private UserRepository userRepository;

    @DisplayName("User 를 생성한다.")
    @Test
    void create() {
        // given
        User user = User.of("최영진", 33);

        // when
        userRepository.save(user);

        // then
        User findUser = userRepository.findById(user.getId()).get();
        assertEquals(user.getId(), findUser.getId());
    }
}