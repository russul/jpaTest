package cn.scut.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: main.java.cn.scut.entity
 * @date:2018/9/5
 */

@Entity
@Table(name = "jpa_user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;
    private String name;
    private String age;



    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY,mappedBy = "user")
//    设置一些级联操作和懒加载，多的一方默认懒加载，比如这里的Order
//    mappedBy属性类似于Hibernate中<set name="",inverse="true">的inverse=true（让对方维护外键），
// 少的一方放弃对外键的维护，如果不这样，Hibernate默认是双向的外键维护,mappedBy标注了关系被维护端（少的一方），
// 它的值是关系维护端（多的一方）负责维护关系的属性名，比如这里的Order的属性user
    private Set<Order> orders=new HashSet<Order>();
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
