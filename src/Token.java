public abstract class Token
{
  private CalculatorVisitor visitor;

  abstract void accept(CalculatorVisitor visitor);
}
