package ex3;

public class ZooBuilder {
    private String name;
    private Zoo zoo;

    public ZooBuilder() {
    }
    public ZooBuilder(String name) {
        this.zoo = new Zoo(name);
    }

    public ZooBuilder appendAnimals(){


        return this;
    }
    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return zoo
     */
    public Zoo getZoo() {
        return this.zoo;
    }

    /**
     * set field
     *
     * @param zoo
     */
    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
