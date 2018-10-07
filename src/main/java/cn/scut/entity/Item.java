package cn.scut.entity;

import javax.persistence.*;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: cn.scut.entity
 * @date:2018/9/6
 */
//标注这是一个实体Bean
@Entity
//对应的表名
@Table(name = "jpa_item")
public class Item {
//    主键标识
    @Id
//    主键生成策略，默认由Hibernate根据使用的数据库自动确定
    @GeneratedValue
//    属性对应的列名
    @Column(name = "item_id")
    private Integer id;
    @Column(name = "item_name")
    private String name;

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
