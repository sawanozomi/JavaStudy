import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class Kadai2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> readLines = fileRead("src/BookInfo.csv");

            for (String s : readLines) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<String> fileRead(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(
                        filePath,
                        Charset.forName("MS932")
                )
        );
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

    private static ArrayList<Book> parseToBookList(ArrayList<String> readLine){
        
    }


}
