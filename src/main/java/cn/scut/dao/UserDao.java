package cn.scut.dao;

import cn.scut.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: cn.scut.dao
 * @date:2018/9/5
 */
public class UserDao {
    public void save(User user){
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpa");
//        EntityManager entityManager=factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();
//        entityManager.close();
        factory.close();
    }
}
