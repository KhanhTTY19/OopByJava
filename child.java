class testmidterm {
    protected int x1;
    public static void main (String args[]) {
        int x = 1;
        final int y = x;
        
        System.out.println(Integer.toString(1, 1).toUpperCase());

    }
}

public class child extends testmidterm {

    child(int x) {
        x1 = x;
    }
    public void print() {
        System.out.println(x1);
    }
}
