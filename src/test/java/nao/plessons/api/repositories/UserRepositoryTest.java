package nao.plessons.api.repositories;

import nao.plessons.api.BaseTest;
import nao.plessons.api.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest implements BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllTest() {

        List<User> users = userRepository.findAll();

        assertEquals(3, users.size());
    }

}