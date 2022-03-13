import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperandTest {
    private static Operand operand;


    @Test
    void testGetValue(){
        operand = new Operand(420);
        assertEquals(420, operand.getValue());
    }


}