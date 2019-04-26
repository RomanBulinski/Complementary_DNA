import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void makeComplementTest(){
        assertEquals("AATT", Main.makeComplement("TTAA"));
    }

    @Test
    public void makeComplementTest2(){
        assertEquals("TAACG", Main.makeComplement("ATTGC"));
    }

    @Test
    public void makeComplementTest3(){
        assertEquals("CATA", Main.makeComplement("GTAT"));
    }

}
