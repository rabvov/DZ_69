public class Main {
     public static void main(String[] args) {
        Double list1 = 5.0;
        Double list2 = 5.0;
        Average name = new Average(list1, list2);
        name.className();
        new Cat("Cat", "Black");
        new Dog("Dog", "White");
        Beard beard = new Beard("Beard", "Red");
        NameAnimal list = new NameAnimal(beard);
        list.name();
    }
}
