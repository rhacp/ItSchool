package session11_oop_abstraction.practice.user_service;

public interface UserService {

    /**
     *
     * @param user
     * @return
     */
    User createUser(User user);
    void deleteUser(long id);
}
