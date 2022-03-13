import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Tests {
    private static Client client;

    @BeforeEach
    void setup() {
        client = new Client();
    }

    @Test
    public void test1() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(4));
        tokens.add(new Operand(7));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        assertEquals(28, client.evaluateExpression(tokens));
    }

    @Test
    public void test2() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(4));
        tokens.add(new Operand(7));
        tokens.add(new Operand(2));
        tokens.add(new Operator(Operation.ADDITION));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        assertEquals(36, client.evaluateExpression(tokens));
    }

    @Test
    public void test3() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(4));
        tokens.add(new Operand(7));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        tokens.add(new Operand(20));
        tokens.add(new Operator(Operation.SUBTRACTION));
        assertEquals(8, client.evaluateExpression(tokens));
    }

    @Test
    public void test4() {

        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(3));
        tokens.add(new Operand(4));
        tokens.add(new Operand(7));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        tokens.add(new Operand(2));
        tokens.add(new Operator(Operation.DIVISION));
        tokens.add(new Operator(Operation.ADDITION));
        assertEquals(17, client.evaluateExpression(tokens));

    }
}