package Solutions.CoreConcepts.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;;
import java.io.IOException;
import java.io.FileNotFoundException;

/* This Reader/Writer supports Character Stream*/
public class BufferedReaderWriter implements ReaderWriter {

    private String directory = System.getProperty("user.home") + File.separator + "Desktop";
    private String fileName = "sampleBRW.txt";
    private String absolutePath = directory + File.separator + fileName;

    public BufferedReaderWriter() {
        System.out.println("BufferedReaderWriter IO Absolute Path: " + absolutePath);
    }

    public void read() {
        try {
            System.out.println("File Read operation started using BufferedReader");

            BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
            String input = reader.readLine();

            while(input != null) {
                System.out.print(input);
                input = reader.readLine();
            }
            reader.close();

            System.out.println();
            System.out.println("File Read operation completed using BufferedReader");
        } catch (FileNotFoundException exception) {
            System.out.println("BufferedReader File Not Found Exception:\n" + exception);
        } catch (IOException exception) {
            System.out.println("BufferedReader IO Exception:\n" + exception);
        }
    }

    public void write(String message) {
        try {
            System.out.println("File Write operation started using BufferedWriter");

            BufferedWriter writer = new BufferedWriter(new FileWriter(absolutePath));
            writer.write(message);
            writer.close();

            System.out.println("File Write operation completed using BufferedWriter");
        } catch(IOException exception) {
            System.out.println("BufferedWriter IO Exception:\n" + exception);
        }
    }


}
