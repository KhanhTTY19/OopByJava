class MyClass {
    static int a; int b; // This is attribute
    int c;

    void method() {
        System.out.println("This is first method");
    }

    void method_increase_attribute(int a) {
        a++;
    }

    MyClass(int a) {  //constructor when create an instance of MyClass with only one parameter 
        this.a = a;
        b = a;
        c = 0;
    }

    MyClass(int a, int b){ //constructor when create an instance of MyClass with 2 parameters
        this(a);
        this.b = b;
    }

    static int returnA(int x)
    {
      
        return x;
    }

    static void try_change_a(int x) {
        a = returnA(x); // a can only be changed if a is a static variable
    }

    //They can only directly call other static methods.
    // They can only directly access static data.
    //They cannot refer to this or super in any way.

}

public class HelloClass {
    public static void main(String[] args) {
        MyClass obj;
        obj = new MyClass(1, 2);
        MyClass newobj;
        newobj = new MyClass(5);
        newobj.a = 4; //Both value of attribute a of newobj and obj are changed to 4
        MyClass.try_change_a(3); //access static without need to create obj MyClass, 
                                   //both value of attribute a of newobj and obj are changed to 3
        System.out.println(newobj.b); //but two attribute b are still different
    }
}
