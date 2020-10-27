import Solutions.CoreConcepts.IO.FileReaderWriter;

public class Main {

    public static void main(String... args) {
        System.out.println("Program compiled!");

        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        fileReaderWriter.write("Let Me Code Baby");
        fileReaderWriter.read();
    }
}
