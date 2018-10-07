package cn.scut.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: create by kevinYang
 * @version: v1.0
 * @description: cn.scut.entity
 * @date:2018/9/6
 */

@Entity
@Table(name = "jpa_teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToMany(cascade = {CascadeType.REFRESH},mappedBy = "teachers",fetch = FetchType.LAZY)
//    级联操作设置由具体业务情景确定
    private Set<Student> students =new HashSet<Student>();

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


    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
