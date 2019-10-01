package household;

import java.util.ArrayList;
import java.util.Scanner;

public class PetTests {
    public static void main(String[] args) {



    ArrayList<Pets> petRay = new ArrayList<Pets>();
        System.out.println("How many pets do you have");
    Scanner scanner = new Scanner(System.in);
    int petNum = scanner.nextInt();
    scanner.nextLine();



        while (petNum > 0){


        System.out.println("What kind of pets do you have");
        String userInput=scanner.next();
        if (userInput.equals("dog")) {
            System.out.println("whats your dogs name");
            String petName= scanner.nextLine();
            Dog dog= new Dog(petName);
            dog.setName(scanner.nextLine());
            petRay.add(dog);
            dog.speak();

        }else if(userInput.equals("cat")){
            System.out.println("whats your cats name");
            String petName= scanner.nextLine();
            Cat cat = new Cat(petName);
            cat.setName(scanner.nextLine());
            petRay.add(cat);
            cat.speak();

        }else if(userInput.equals("snake")){
            System.out.println("whats your snakes name");
            String petName= scanner.nextLine();
            Snake snek = new Snake(petName);
            snek.setName(scanner.nextLine());
            petRay.add(snek);
            snek.speak();

        }



        petNum--;
    }
        for (Pets x : petRay) {
            System.out.println(x.getName());
            x.speak();


        }

}
}




