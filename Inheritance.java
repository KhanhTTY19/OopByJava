public class Inheritance {
    
    void printLine(int x, String y) {
        System.out.println("From A" + x + y
        );
    }

    public static void main(String arg[]) {
        F a = new F();
        a.printLine(1);
        a.printLine(2, "OOP");
        a.printLine("Java");
        a.printLine("OOP", "Java");
        a.fromH();
        C c = new C();
        c.fromH();
        //a.printLine("OOP", 3);
    }
}

class C extends Inheritance implements H {

    void printLine(String x, String y) {
        System.out.println("From C " + x + y);
    }

    public void fromH() {
        System.out.println("From C");
    }
}


class B extends Inheritance {

    void printLine(int x) {
        System.out.println("From B" + x);
    }
}

class D extends C {
    void printLine(String x, String y) {
        System.out.println("From D" + x + y);
    }
}

class E extends C {
    void printLine(String x)
    {
        System.out.println("From E" + x);
    }
}

class F extends E {
    void printLine(int x) {
        System.out.println("From F" + x);
    }

    public void fromH() {
        System.out.println("From F");
    }
}

class G extends E {
    void printLine(String x) {
        System.out.println("From G" + x);
    }
}

interface H {
    void fromH();
}