package cn.scut.entity;

import org.omg.CORBA.INTERNAL;

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
@Table(name = "jpa_student")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToMany(cascade = {CascadeType.REFRESH})
    @JoinTable(name = "student_teacher",inverseJoinColumns = @JoinColumn(name="teacher_id"),joinColumns = @JoinColumn(name="student_id"))
//    设置关联表（中间表）,中间表字段名称由Hibernate自动生成，Set集合的名字_id,
// inverseJoinColumns设置关系被维护端的外键，joinColumns是设置关系维护端的外键，通过他们可以修改中间表字段名字

    private Set<Teacher> teachers=new HashSet<Teacher>();

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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
