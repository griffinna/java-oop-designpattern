package chapter02.petercode;

public class Person {
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void doIt() {
        role.doIt();
    }
}
