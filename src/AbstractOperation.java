public abstract class AbstractOperation {
  public abstract double operate(int firstNumber, int secondNumber);
}
class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
      return firstNumber + secondNumber;
    }
}

class SubstractOperation extends AbstractOperation {
  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }
}

class MultiplyOperation extends AbstractOperation {
  @Override
  public double operate(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }
}

class DivideOperation extends AbstractOperation {
  @Override
  public double operate(int firstNumber, int secondNumber) {
    return (double) firstNumber / secondNumber;
  }
}