package session11_oop_abstraction.practice.user_service;

public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        //validate user
        //set special properties (like LocalDateTime(created at) or setAccountNumber)
        //save user to database
        //return user
        return null;
    }

    @Override
    public void deleteUser(long id) {
        //...
    }
}
