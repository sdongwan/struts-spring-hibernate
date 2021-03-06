package bean;
import java.io.Serializable;
/**
 * Created by Administrator on 2017/6/6.
 */
public class StudentsBean implements Serializable {

    private int id;
    private String name;
    private int age;

    public StudentsBean() {
    }

    public StudentsBean(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentsBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
