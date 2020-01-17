import java.io.*;
import java.net.*;

public class Download {

    public static byte[] bytes(URL url) throws IOException {
        InputStream input = (InputStream) url.getContent();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = 0;
        byte[] arr = new byte[1024];

        while (-1 != (n = input.read(arr)))
            out.write(arr, 0, n);

        return out.toByteArray();
    }

    public static String string(URL url) throws IOException {
        return new String(bytes(url));
    }

    public static void main(String... args) {
        try {
            URL url = new URL("http://google.com");
            System.out.println(string(url));
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
