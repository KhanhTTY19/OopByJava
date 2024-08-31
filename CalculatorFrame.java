import java.awt.*;
import java.awt.event.*;

class CalculatorFrame extends Frame implements ActionListener{
    CalculatorEngine engine;
    TextField display;
    WindowListener listener = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {System.exit(0);}   
    };
    CalculatorFrame (CalculatorEngine e) {
        super("Calculator");
        Panel top, bottom; Button b;

        engine = e;
        top = new Panel();
        top.add(display = new TextField(20));
        bottom = new Panel();
        bottom.setLayout(new GridLayout(4,4));
        bottom.add(b = new Button("1")); b.addActionListener(this);
        bottom.add(b = new Button("2")); b.addActionListener(this);
        bottom.add(b = new Button("3")); b.addActionListener(this);
        bottom.add(b = new Button("+")); b.addActionListener(this);
        bottom.add(b = new Button("4")); b.addActionListener(this);
        bottom.add(b = new Button("5")); b.addActionListener(this);
        bottom.add(b = new Button("6")); b.addActionListener(this);
        bottom.add(b = new Button("-")); b.addActionListener(this);
        bottom.add(b = new Button("7")); b.addActionListener(this);
        bottom.add(b = new Button("8")); b.addActionListener(this);
        bottom.add(b = new Button("9")); b.addActionListener(this);
        bottom.add(b = new Button("*")); b.addActionListener(this);
        bottom.add(b = new Button("C")); b.addActionListener(this);
        bottom.add(b = new Button("0")); b.addActionListener(this);
        bottom.add(b = new Button("=")); b.addActionListener(this);
        bottom.add(b = new Button("/")); b.addActionListener(this);
        setLayout(new BorderLayout());
        add("North", top);
        add("South", bottom);
        addWindowListener(listener);
        setSize(180,160);
        show();
    }
    public void actionPerformed(ActionEvent e) {
        char c = e.getActionCommand().charAt(0);
        if (c == '+') engine.add();
        else if (c == '-') engine.substract();
        else if (c == '*') engine.multiply();
        else if (c == '/') engine.divide();
        else if (c >= '0' && c <= '9') engine.digit(c - '0');
        else if (c == 'c' || c == 'C') engine.clear();
        else if (c == '=') engine.compute();
        display.setText(new Integer(engine.display()).toString());
    }
    public static void main(String[] args) {
        new CalculatorFrame(new CalculatorEngine());
    }
}
