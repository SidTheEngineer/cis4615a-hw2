import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt() & (int) 0xFFFFFFFFL; // Mask with 32 one-bits
    }

    public static void main(String[] args) {
        DataInputStream is = new DataInputStream(System.in);
        try {
            System.out.println(getInteger(is));
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
