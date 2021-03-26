package oop;

public class StackClient {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        st.push(20);
        System.out.println(st.peek());
    }
}
