public abstract class Pet {

    private String name;

    public Pet() {

    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + '}';
    }

    public String speak() {
        return "I am your cute pet";
    }

    public String move() {
        return "I cannot move as I do not know what pet I am";
    }

}
