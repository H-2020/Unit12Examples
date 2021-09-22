package examples;

import java.time.Instant;


public class Example2 {
    public static void main(String[] args) {

        System.out.println(Instant.now());

        Instant later = Instant.now().plusSeconds(7).plusMillis(5).plusNanos(3);
        System.out.println(later);


    }


}
