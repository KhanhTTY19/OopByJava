import java.io.IOException;

public class tryException {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 0;
        float c = 0;
        
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());

            try {
                System.out.print("Enter value for a: ");
                a = readInteger();
                System.out.print("Enter value for b: ");
                b = readInteger();

                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    c = (float) a / b;
                    System.out.println("Result: " + c);
                }
            } catch (IOException ioException) {
                System.out.println("IOException: " + ioException.getMessage()); 
            } catch (NumberFormatException nfe) {
                
                System.out.println(nfe.getMessage());
            }
        }
    }

    private static int readInteger() throws IOException {
        StringBuilder sb = new StringBuilder();
        int input;
        while ((input = System.in.read()) != '\n' && input != -1) {
            if (Character.isDigit(input)) {
                sb.append((char) input);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
