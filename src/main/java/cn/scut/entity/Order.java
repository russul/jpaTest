package cn.scut.entity;

import javax.persistence.*;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: cn.scut.entity
 * @date:2018/9/6
 */

@Entity
@Table(name = "jpa_order")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Integer id;
    @Column(name = "order_name" ,length = 20)
    private String name;

    @ManyToOne(cascade = {CascadeType.ALL},optional = false)
//    optional=false,代表该属性必须存在，也就是Order必须属于一个用户
    @JoinColumn(name = "user_id")
//    设置外键列名称
    private User user;
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
}
