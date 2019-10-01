package household;

public class Pets {
    private String name;


    public Pets(String name) {
        this.name = name;
        ;

    }

    public void speak() {
        System.out.println("Pet Sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                '}';
    }
}
