package repeticoes;

import java.nio.file.attribute.PosixFileAttributes;
import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args) {

        IntStream.of(1,2,3,4,5).forEach(n->{
            System.out.println("Iteração: "+ n);
        });

        IntStream.range(0,4).forEach(n->{
            System.out.println("Posição: "+n);;
        });
    }
}
