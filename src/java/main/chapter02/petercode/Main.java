package chapter02.petercode;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setRole(new Driver());
        person.doIt();
        person.setRole(new Worker());
        person.doIt();
    }
}
