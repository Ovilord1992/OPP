package Table_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PatternImple extends ArrayHendler {
    @Override
    public int max(int a, int b, int c) {
        return IntStream.of(a, b,c).max().getAsInt();
    }

    @Override
    public int min(int a, int b, int c, int d, int i) {
        return IntStream.of(a, b,c).min().getAsInt();
    }

    @Override
    public double avg(int... c) {
        return Arrays.stream(c).average().orElse(0);
    }


}
