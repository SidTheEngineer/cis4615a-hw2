import java.io.File;

public class R02_EXP00_J {
    public static void deleteFile(){
        File someFile = new File("example_file.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.out.println("Could not delete the file!");
        }
       
    }

    public static void main(String[] args) {
        deleteFile();
    }
}