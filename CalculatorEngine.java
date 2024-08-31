class CalculatorEngine{
    int value;
    int keep;
    char todo;

    void BinaryOperation(char op) {
        keep = value;
        value = 0;
        todo = op;
    }
    void add()          {BinaryOperation('+');}
    void substract()    {BinaryOperation('-');}
    void multiply()     {BinaryOperation('*');}
    void divide()       {BinaryOperation('/');}

    int display() {
        return value;
    }

    void clear() {
        value = 0;
        keep = 0;
    }

    void digit(int x) {
        value = value*10 + x;
    }

    void compute(){
        if (todo == '+') 
            keep += value;
        if (todo == '-')
            keep -= value;
        if (todo == '*')
            keep *= value;
        if (todo == '/') 
            keep /= value;
        value = keep;
        keep = 0;
    }
    CalculatorEngine() { clear(); }
    public static void main(String arg[]) {
        CalculatorEngine c = new CalculatorEngine();
    }
}

