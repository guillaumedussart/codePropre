package ex3;

public enum EnumAnimalsType {
    MAMMIFERE("CARNIVORE"),
    MAMMIFERE("HERBIVORE"),
    REPTILE(null),
    POISSON(null);

    private String type;

    public EnumAnimalsType(String type) {
        this.type = type;
    }

    /**
     * get field
     *
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * set field
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
