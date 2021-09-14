package oops;

public class DogTest {
    public static void main(String[] args) {
        Labrador doggy = new Labrador("Tommy", "black");
        System.out.println(doggy.getName() + " sounds like " + doggy.speak() + "and looks like " + doggy.getColor() + " in color");
        Yorkshire breed = new Yorkshire("Jhonny");
        System.out.println(breed.getName() + " Sounds like " + breed.speak());
    }
}
