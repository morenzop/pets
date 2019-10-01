package household;

public class Cat extends Pets {
    private String catBreed;


    public Cat(String catBreed,String name){
        super(name);
        this.catBreed=catBreed;
    }

    public Cat(String petName) {
        super(petName);
    }


    @Override
   public void  speak() {
       System.out.println("Meow");
   }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                '}';
    }
}
