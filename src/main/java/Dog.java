

public class Dog extends Pet {

    //private String name;
    private int dangerLevel;
    //private String output;

    public Dog() {
        super();

    }

    public Dog(int dangerLevel, String name) {
        super(name);
        this.dangerLevel = dangerLevel;
        //this.name = name;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setdangerLevel(int dL) {
        dangerLevel = dL;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "dangerLevel=" + dangerLevel + '}';
    }

    public void setDangerLevel() {
        for (int i = 1; i > 3; i++);
        System.out.println("For invalid values equals" + dangerLevel);
    }

    public String speak() {
        return "Dogs says Woof-Woof";
    }

    public String move() {
        return "Dogs walks and runs. I wish I could a climb tree to catch a cat";
    }

    public String howDangrous() {
        String output = "";

        if (dangerLevel == 1) {
            output += "Suitable for children";
            //System.out.println("Suitable for children");
        }
        else if (dangerLevel == 2) {
            output += "Needs a strong owner that can control me";
        }
        else if (dangerLevel == 3) {
            output += "Watch dog only Attack and bite strangers";
        }

        return output;
    }
}

