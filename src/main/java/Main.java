import Solutions.CoreConcepts.IO.FileReaderWriter;
import Solutions.CoreConcepts.IO.BufferedReaderWriter;

public class Main {

    public static void main(String... args) {
        System.out.println("Program compiled!");

//        FileReaderWriter fileReaderWriter = new FileReaderWriter();
//        fileReaderWriter.write("Let Me Code - File Reader Writer");
//        fileReaderWriter.read();

        BufferedReaderWriter bufferedReaderWriter = new BufferedReaderWriter();
        bufferedReaderWriter.write("Let Me Code - Buffered Reader Writer");
        bufferedReaderWriter.read();
    }
}
