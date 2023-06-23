public class Real extends Product {
    private int size;
    private int weight;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Real{"
                + "name='" + getName()
                + ", price=" + getPrice()
                + ", size=" + size
                + ", weight=" + weight
                + '}';
    }
}
