package cn.scut.entity;

import javax.persistence.*;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: cn.scut.entity
 * @date:2018/9/6
 */

@Entity
@Table(name = "jpa_wife")
public class Wife {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name="husband_id")
    private Husband husband;
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
