public class Average<T, V> {
    private T x;
    private V y;

    public Average(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public void className() {
        Boolean s = false;
        s = this.x.getClass().equals(this.y.getClass());
        if (s) {
            System.out.println("Классы одинаковые");
        } else {
            System.out.println("Классы не одинаковые");
        }

    }
}
