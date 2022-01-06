package testgroup.web.dao;

import org.springframework.stereotype.Repository;
import testgroup.web.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDaoImp implements UserDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<>();

    static {
        User user1 = new User("Kostya", "D", "lord@mail.ru");
        user1.setId(AUTO_ID.getAndIncrement());
        users.put(user1.getId(), user1);
        User user2 = new User("Vasya", "D", "V@mail.ru");
        user2.setId(AUTO_ID.getAndIncrement());
        users.put(user2.getId(), user2);
        User user3 = new User("Misha", "D", "M@mail.ru");
        user3.setId(AUTO_ID.getAndIncrement());
        users.put(user3.getId(), user3);
        User user4 = new User("Nata", "P", "N@mail.ru");
        user4.setId(AUTO_ID.getAndIncrement());
        users.put(user4.getId(), user4);
    }



    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
