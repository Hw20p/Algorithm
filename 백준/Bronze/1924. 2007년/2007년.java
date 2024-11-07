import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        LocalDate date = LocalDate.of(2018, arr[0], arr[1]);
        System.out.println(date.getDayOfWeek().toString().substring(0, 3));
    }
}

