import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class OperatorTest {

    @Test
    void testGetValue(){
        Operator operator = new Operator(Operation.DIVISION);
        assertEquals(Operation.DIVISION, operator.getOperation());
    }
}