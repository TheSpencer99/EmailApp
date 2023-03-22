package Services;

import org.semicolon.africa.EmailApp.Data.Models.User;
import org.semicolon.africa.EmailApp.Data.Repositories.UserRepository;
//import org.semicolon.africa.EmailApp.Data.Repositories.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.semicolon.africa.EmailApp.Services.UserService;
import org.semicolon.africa.EmailApp.Services.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp() {
//        userRepository = new UserRepositoryImpl();
//        user = new User();
//        user.setFirstName("God");
//        user.setLastName("Almighty");
//        user.setPassword("1234");
//        user.setEmailAddress("God@heaven.com");
//        userRepository.save(user);
//    }
//
//    @Test
//    public void saveUserTest() {
//        UserService userService = new UserServiceImpl();
//        User user = new User();
//        user.setFirstName("God");
//        user.setLastName("Almighty");
//        user.setPassword("1234");
//        user.setEmailAddress("God@heaven.com");
//        userService.save(user);
//        assertEquals(1, userService.size());
//
//    }
//
//    @Test
//    public void TestUserCanBeFound() {
//        UserService userService = new UserServiceImpl();
//
//        userService.save(user);
//        assertEquals(user, userService.findUserByFirstName("God"));
//    }
//
//    @Test
//    public void TestUserCanBeFoundByLastName() {
//        UserService userService = new UserServiceImpl();
//
//        userService.save(user);
//        //  userService.findUserByLastName("Almighty");
//        assertEquals(user, userService.findUserByLastName("Almighty"));
//    }
//
//    @Test
//    public void TestUserCanBeFoundByFirstName() {
//        UserService userService = new UserServiceImpl();
//
//        userService.save(user);
//        //  userService.findUserByLastName("Almighty");
//        assertEquals(user, userService.findUserByFirstName("God"));
//
//
    }
}