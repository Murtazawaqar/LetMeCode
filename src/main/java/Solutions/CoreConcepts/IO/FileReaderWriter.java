package Solutions.CoreConcepts.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/* This Reader/Writer supports Character Stream*/
public class FileReaderWriter implements ReaderWriter{

    private String directory = System.getProperty("user.home") + File.separator + "Desktop";
    private String fileName = "sampleFRW.txt";
    private String absolutePath = directory + File.separator + fileName;

    public FileReaderWriter() {
        System.out.println("FileReaderWriter IO Absolute Path: " + absolutePath);
    }

    public void read() {
        try {

            System.out.println("File Read operation started using FileReader");

            FileReader reader = new FileReader(absolutePath);
            int character = reader.read();
            while(character != -1) {
                System.out.print((char) character);
                character = reader.read();
            }
            reader.close();

            System.out.println();
            System.out.println("File Read operation completed using FileReader");
        } catch(FileNotFoundException exception) {
            System.out.println("FileWriter File Not Found Exception:\n" + exception);
        } catch(IOException exception) {
            System.out.println("FileWriter IO Exception:\n" + exception);
        }
    }

    public void write(String message) {
        try {
            System.out.println("File Write operation started using FileWriter");

            FileWriter writer = new FileWriter(absolutePath);

            String messageAlt = "Let Me Code";
            writer.write(message);
            writer.close();

            System.out.println("File Write operation completed using FileWriter");

        } catch(IOException exception) {
            System.out.println("FileWriter IO Exception:\n" + exception);
        }
    }
}
