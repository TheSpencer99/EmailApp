//package Data.Repositories;
//
//import org.semicolon.africa.EmailApp.Data.Models.User;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.semicolon.africa.EmailApp.Data.Repositories.UserRepository;
//import org.semicolon.africa.EmailApp.Data.Repositories.UserRepositoryImpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserRepositoryImplTest {
//    UserRepository userRepository;
//    User user;
//
//    @BeforeEach
//
//    void setUp(){
//      userRepository = new UserRepositoryImpl();
//      user = new User();
//        user.setFirstName("God");
//        user.setLastName("Almighty");
//        user.setPassword("1234");
//        user.setEmailAddress("God@heaven.com");
//        userRepository.save(user);
//
//    }
//
//
//    @Test
//    public void TestRepositoryCanSave(){
//        assertEquals(1, userRepository.count());
//    }
//
//    @Test
//    public void TestUserCanBeFound(){
//        assertEquals(user, userRepository.findUserByFirstName("God"));
//    }
//
//    @Test
//    public void TestTwoUsersCanBeFound(){
//        User user2 = new User();
//        user2.setFirstName("God");
//        userRepository.save(user2);
//        assertEquals(2, userRepository.count());
//        assertEquals(2, userRepository.size());
//    }
//
//    @Test
//    public void TestTwoUsersCanBeSavedAndDeleteOneUser(){
//        User user2 = new User();
//        user2.setFirstName("Almighty");
//        userRepository.save(user2);
//        userRepository.deleteByFirstName("God");
//        assertEquals(user2, userRepository.findUserByFirstName("God"));
//        assertEquals(1, userRepository.size());
//    }
//
//    @Test
//    public void TestTwoUsersCantHaveSameEmails(){
//        User user1 = new User();
//        user1.setEmailAddress("God@heaven.com");
//        User user2 = new User();
//        user2.setEmailAddress("God@heaven.com");
//        userRepository.save(user1);
//        userRepository.save(user2);
//        assertEquals(user1, userRepository.equals(""));
//
//    }
//
//
//
//}