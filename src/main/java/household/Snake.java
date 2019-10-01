package household;

public class Snake extends Pets {
    private String scalePattern;

    public Snake(String scalePattern, String name){
        super(name);
        this.scalePattern=scalePattern;
    }

    public Snake(String petName) {
        super(petName);
    }


    @Override
    public void  speak() {
        System.out.println("Bldlp");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "scalePattern='" + scalePattern + '\'' +
                '}';
    }
}


