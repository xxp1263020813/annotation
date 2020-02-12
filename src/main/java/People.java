import org.springframework.context.annotation.Bean;


public class People {
    public String name;
    public String id;
    public int age;

    public People(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
