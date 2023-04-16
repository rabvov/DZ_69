public class NameAnimal<T extends Animal> {

    private String x;
    private String y;

    public void name (Animal obj){
        System.out.print("Животное называеться "+x);
        System.out.println(", и оно "+y+" цвета");
    }

    public NameAnimal(T animal) {
        this.x = animal.getNameAnimal();
        this.y = animal.getColorAnimal();
        name(animal);
    }




}
