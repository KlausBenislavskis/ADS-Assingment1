import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;

public interface Calculator
{
  int getResult() throws MalformedParametersException;
}
