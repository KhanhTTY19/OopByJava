class Color {
    int RED = 1;
    int BLUE = 0;

    Color(int changeBlue) {
        BLUE = changeBlue;
    }
    void setColor(int c) {
        BLUE += c;
    }

    public static void main (String arg[]) {
        Color c = new Color(3);
        ChangeColorSystem ccs = new ChangeColorSystem(0);
        c.setColor(5);
        ccs.setColor(0, 2);
        System.out.println("blue is " + ccs.BLUE);
        System.out.println("blue of c is " + c.BLUE);
        
        //System.out.println("blue is " + ccs.BLUE);
    }
}

interface ColorSystem { // All 
    int GREEN  = 2; 
    //int BLUE = 4;

    int add();

}

class ChangeColorSystem extends Color implements ColorSystem{
    
    ChangeColorSystem(int newBlue) {
        super (newBlue);
    }
    
    public int add() { // Method of interface implemented in a class MUST BE public
        BLUE ++;
        return BLUE;
    }

    void setColor(int c, int d) {
        BLUE = c + d;
    }
}

abstract class ChangeColorSystem2 extends Color implements ColorSystem {  // if don't want to implement the method of interface
                                                                          // the class MUST BE declared as abstract class
    ChangeColorSystem2(int newBlue) {
        super(newBlue);
    }
}