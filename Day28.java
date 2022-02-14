import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        ArrayList<String> results = new ArrayList<String>();
        
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[1].endsWith("@gmail.com"))
                results.add(tokens[0]);
        }
        
        Collections.sort(results);
        for (String s : results) {
            System.out.println(s);
        }
    }
}