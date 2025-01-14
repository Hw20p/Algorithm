import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
        int b = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
        
        System.out.println(a < b ? b : a);
    }
}
