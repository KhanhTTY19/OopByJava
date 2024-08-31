class Person {
    private String name;
    Person(String aname) {name = aname;}
    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private String employeeNumber;
    private float basicSalary;

    Employee(String aName, String aEmployeeNumber, float aBasicSalary) {
        super(aName);
        employeeNumber = aEmployeeNumber;
        basicSalary = aBasicSalary;
    }
    
    public String getEmployeeNumber() {
        return employeeNumber;
    } 

    public float getBasicSalary() {
        return basicSalary;
    }

    public float getPay() {
        return basicSalary;
    }

    public static void main(String arg[]) {
        Manager m = new Manager("Chin", "00001", 100, 20);
        SalePerson sp = new SalePerson("U3", "00002", 200, 10);
        SaleManager sm = new SaleManager("Om","000003", 100, 0);
        System.out.println("Allowance of " + m.getName() + " is " + m.getAllowance());
        System.out.println(sm.authorize());
    }
}

class Manager extends Employee {
    private float allowance;

    public float getAllowance() {
        return allowance;
    }

    public float getPay() {
        return (getBasicSalary() + allowance);
    }

    boolean authorize() {
        return true;
    }

    Manager(String aName, String aEmployeeNumber, float aBasicSalary, float aAllowance){
        super(aName, aEmployeeNumber, aBasicSalary);
        allowance = aAllowance;
    }
}

interface Managers {
    boolean authorize();
    void test();
}

class SalePerson extends Employee {
    private float commission;

    SalePerson(String aName, String aEmployeeNumber, float aBasicSalary, float aCommission) {
        super(aName, aEmployeeNumber, aBasicSalary);
        commission = aCommission;
    } 

    public float getCommission() {
        return commission;
    }
}

class SaleManager extends SalePerson implements Managers {
    public boolean authorize() {
        System.out.println("Order authorized");
        return true;
    }

    public void test() {
        System.out.println("I just want to test");
    }

    SaleManager(String aName, String aEmployeeNumber, float aBasicSalary, float aCommission) {
        super(aName, aEmployeeNumber, aBasicSalary, aCommission);
    }
}


class NewSaleManager extends SalePerson implements Managers {
    public boolean authorize() {
        System.out.println("Order authorized");
        return true;
    }

    public void test() {
        System.out.println("I dont just want to test");
    }

    NewSaleManager(String aName, String aEmployeeNumber, float aBasicSalary, float aCommission) {
        super(aName, aEmployeeNumber, aBasicSalary, aCommission);
    }
}