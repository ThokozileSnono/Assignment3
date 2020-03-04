public class TestPet {

    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new Cat("Grey");
        pets[1] = new Dog(3, "Huston");
        pets[2] = new Cat("Kath");
        pets[3] = new Dog(2, "Johny");
        pets[4] = new Cat("Tony");

        String output = "";

        for (int i = 0; i < pets.length; i++) {
            System.out.print("\n");
            System.out.println(pets[i].toString());
            System.out.println(pets[i].speak());
            System.out.println(pets[i].move());


        }

        for (int i = 0; i < pets.length; i++) {
            System.out.print("\n");

            if (pets[i] instanceof Dog) {
                //System.out.println((Dog) pets[i].howDangrous());
                //output += " " + ((Dog) pets[i].howDangrous());
            }

        }

    }
}
