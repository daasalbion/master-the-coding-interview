package py.com.daas.edu.java.bigo;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BigO {

    public static void main(String[] args) {
        int n = 1000000;
        String[] nemo = new String[n];
        Arrays.fill(nemo, 0, n, "nemo");
        findNemo(nemo);
    }

    private static void findNemo(String[] nemo) {
        Instant start = Instant.now();
        for (String s: nemo) {
            if (s.equals("nemo")) {
                System.out.println("Found Nemo");
            }
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toSeconds();
        System.out.printf("%d seconds%n", timeElapsed);
    }
}
