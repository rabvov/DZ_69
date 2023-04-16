public class Main {
     public static void main(String[] args) {
        Double list1 = 5.0;
        Double list2 = 5.0;
        Average name = new Average(list1, list2);
        name.className();

        Cat cat = new Cat("Cat", "Black");
        Dog dog = new Dog("Dog", "White");
        Beard beard = new Beard("Beard", "Red");

        NameAnimal list = new NameAnimal<>(cat);




    }
}
