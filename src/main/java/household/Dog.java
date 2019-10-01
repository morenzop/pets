package household;

public class Dog extends Pets {

    private String dogBreed;

public Dog(String dogBreed, String name){
    super(name);
    this.dogBreed=dogBreed;
}

    public Dog(String petName) {
        super(petName);
    }


    @Override
    public void  speak() {
        System.out.println("Bow Wow");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                '}';
    }
}
