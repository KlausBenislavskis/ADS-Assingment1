import java.util.ArrayList;

public class Start
{
  public static void main(String[] args)
  {
    test1();
    test2();
    test3();
    test4();
  }

  private static void test4()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(3));
    tokens.add(new Operand(4));
    tokens.add(new Operand(7));
    tokens.add(new Operator(Operation.MULTIPLICATION));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.DIVISION));
    tokens.add(new Operator(Operation.ADDITION));
    System.out.println(client.evaluateExpression(tokens));

  }

  private static void test3()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(4));
    tokens.add(new Operand(7));
    tokens.add(new Operator(Operation.MULTIPLICATION));
    tokens.add(new Operand(20));
    tokens.add(new Operator(Operation.SUBTRACTION));
    System.out.println(client.evaluateExpression(tokens));

  }

  private static void test2()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(4));
    tokens.add(new Operand(7));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.ADDITION));
    tokens.add(new Operator(Operation.MULTIPLICATION));
    System.out.println(client.evaluateExpression(tokens));
  }

  private static void test1()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(4));
    tokens.add(new Operand(7));
    tokens.add(new Operator(Operation.MULTIPLICATION));
    System.out.println(client.evaluateExpression(tokens));
  }
}
