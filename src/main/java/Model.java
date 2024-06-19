package main.java;
import java.util.List;

public class Model {
    private String name;
    private Integer age;
    private Boolean isBoy;
    private List<Model> friends;

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                ", friend=" + friends +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getStudent() {
        return isBoy;
    }

    public void setStudent(Boolean student) {
        isBoy = student;
    }

    public Model(String name, Integer age, Boolean isBoy) {
        this.name = name;
        this.age = age;
        this.isBoy = isBoy;
    }

}

