public class Encapsulation {
    public static void main(String argv[]) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(2);
        stack.push(1);
        System.out.println("Pop " + stack.pop());
        System.out.println("Pop " + stack.pop());
        int x = 1, y = 0;
        float z = x/y;
    }
}

class Stack {
    private StackItem top, temp;
    private int size;

    public int pop() {
        int x = 0;
        if (isempty()) System.out.println("Stack underflow");
        else {
            x = top.getItem();
            top = top.getPrevious();
            size--;
            //System.out.println("Pop " + x + "from stack");
        }
        return x;
    }

    public void push(int x) {
        temp = new StackItem();
        temp.setItem(x);
        temp.setPrevious(top);
        top = temp;
        size++;
        System.out.println("Pushed " + x);
    }

    public int size() {
        return size;
    }

    public boolean isempty() {
        return (size == 0);
    }

    Stack() {
        top = null;
        size = 0;
    }
}

class StackItem {
    private int item;
    private StackItem previous;

    public int getItem() {return item;}
    public void setItem(int x) {item = x;}
    public StackItem getPrevious() {return previous;}
    public void setPrevious(StackItem p) {previous = p;}

    StackItem() {previous = null;}
}