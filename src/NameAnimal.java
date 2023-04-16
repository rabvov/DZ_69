public class NameAnimal<T extends Animal> {
    private T x;

    public NameAnimal(T x) {
        this.x = x;
    }

    public void name() {
        System.out.print("Имя животного " + this.x.getNameAnimal());
        System.out.print(", а его цвет " + this.x.getColorAnimal());
    }
}
