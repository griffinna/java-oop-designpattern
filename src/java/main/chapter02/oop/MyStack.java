package chapter02.oop;

import java.util.ArrayList;

public class MyStack {

    public static void main(String[] args) {
        RioStack<String> stack = new RioStack<>();
        stack.push("1");
        stack.push("2");
//        stack.set(0, "3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class RioStack<String> {

    private ArrayList<String> arList = new ArrayList<>();

    public void push(String element) {
        arList.add(element);
    }

    public String pop() {
        return arList.remove(arList.size() - 1);
    }

    public boolean isEmpty() {
        return arList.isEmpty();
    }

    public int size() {
        return arList.size();
    }
}
