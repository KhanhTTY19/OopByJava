import java.net.*;
import java.io.*;

class WebRetriever {
    Socket soc;
    OutputStream os; InputStream is;

    void request(String path) {
        try {
            String message = "GET" + path + "\n\n";
            os.write(message.getBytes());
            os.flush();
        } catch (IOException e) {
            System.err.println("Error in HTTP request");
        }
    }

    void getResponse() {
        int c;
        try {
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            } 
        } catch (IOException e) {
                System.err.println("IOException in reading from Web server");
        }
    }

    public void close() {
        try {
            is.close();
            os.close();
            soc.close();
        } catch (IOException e) {
            System.err.println("IOException in closing connection");
        }
    }

    WebRetriever(String server, int port) throws IOException, UnknownHostException {
        soc = new Socket(server, port);
        os = soc.getOutputStream();
        is = soc.getInputStream();
    }

    public static void main(String arg[]) {
        try {
            WebRetriever w = new WebRetriever("www.nus.edu.sg", 80);
            w.request("/NUSinfo/UG/ug.html");
            w.getResponse();
            w.close();
        } catch (UnknownHostException h) {
            System.err.println("Hostname unknown");
        } catch (IOException i) {
            System.err.println("IOException in connecting to Host");
        }
    }
}

