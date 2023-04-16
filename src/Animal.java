public class Animal<T extends String, V extends String> {
    private T nameAnimal;
    private V colorAnimal;

    public Animal(T nameAnimal, V colorAnimal) {
        this.nameAnimal = nameAnimal;
        this.colorAnimal = colorAnimal;
    }

    public T getNameAnimal() {
        return this.nameAnimal;
    }

    public V getColorAnimal() {
        return this.colorAnimal;
    }
}
