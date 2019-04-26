import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static String makeComplement(String dna) {

        String[] dnaArr = dna.split("");
        for (int i = 0; i < dnaArr.length; i++) {
            if (dnaArr[i].equals("A") ) {
                dnaArr[i] = "T";
            } else if (dnaArr[i].equals( "T" ) ) {
                dnaArr[i] = "A";
            } else if (dnaArr[i].equals( "C" ) ) {
                dnaArr[i] = "G";
            } else if (dnaArr[i].equals( "G" ) ) {
                dnaArr[i] = "C";
            }
        }

        return Arrays.stream(dnaArr).collect(Collectors.joining(""));
    }


}
