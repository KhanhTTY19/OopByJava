import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaAPI {
    public static void main(String args[]) {
        ReadWriteStreamFile x = new ReadWriteStreamFile("input.txt", "output.txt");
        x.readAndWriteFile();
        
    }
}

class ReadObject{
    private int val;

    void readObject () {
        try {
            this.val = System.in.read();
        } catch (IOException e) {
            System.err.println("IO error occurs");
        } catch (NumberFormatException f) {
            System.err.println("Pls input an integer");
        }
    }

    public int getVal() {
        return this.val;
    }
}

class ReadWriteFile {
    private String readFile;
    private String writeFile;

    ReadWriteFile(String r, String w) {
        this.readFile = r;
        this.writeFile = w;
    }

    public String getReadFileName () {
        return this.readFile;
    }

    public String getWriteFileName() {
        return this.writeFile;
    }

    public void readAndWriteFile() {
        try {
            int c;
            FileInputStream rf = new FileInputStream(this.getReadFileName());
            FileOutputStream wf = new FileOutputStream(this.getWriteFileName());
            while ((c = rf.read()) != -1) {
                wf.write(c);
            }
            rf.close();
            wf.close();
        } catch (FileNotFoundException e){
            System.err.println("Can't find file");
        } catch (IOException f) {
            System.err.println("IO error occurs");
        } 
    }
}

class ReadWriteStreamFile extends ReadWriteFile {
    ReadWriteStreamFile(String r, String w) {
        super(r, w);
    }
    public void readAndWriteFile() {
        int c;
        try {
            FileInputStream in = new FileInputStream(this.getReadFileName());
            FileOutputStream out = new FileOutputStream(this.getWriteFileName());
            PrintStream p = new PrintStream(out);
            while ((c = in.read()) != -1) {
                p.print((char) c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e){
            System.err.println("Can't find file");
        } catch (IOException f) {
            System.err.println("IO error occurs");
        }
    }
}