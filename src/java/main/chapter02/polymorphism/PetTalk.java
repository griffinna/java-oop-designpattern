package chapter02.polymorphism;

public class PetTalk {

    public static void main(String[] args) {
        Pet[] pets = new Pet[]{new Dog(), new Cat(), new Parrot()};
        groupTalk(pets);
    }

    static void groupTalk(Pet[] pets) {
        for (Pet pet: pets) {
            pet.talk();
        }
    }

}
