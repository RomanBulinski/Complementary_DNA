import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static String makeComplement(String dna) {

        String[] dnaArr = dna.split("");
        for (int i = 0; i < dnaArr.length; i++) {
            if (dnaArr[i].equals( "A" ) ) {
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


//    solution from code wars
    public static String makeComplementCodeWars(String dna) {
        dna = dna.replaceAll("A","Z");
        dna = dna.replaceAll("T","A");
        dna = dna.replaceAll("Z","T");
        dna = dna.replaceAll("C","Z");
        dna = dna.replaceAll("G","C");
        dna = dna.replaceAll("Z","G");
        return dna;
    }




}
