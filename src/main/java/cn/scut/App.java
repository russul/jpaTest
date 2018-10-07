package cn.scut;

import cn.scut.dao.UserDao;
import cn.scut.entity.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        User user = new User("ling");
        user.setAge("10");
        user.setName("lingling");
        UserDao userDao = new UserDao();
        userDao.save(user);
    }
}
