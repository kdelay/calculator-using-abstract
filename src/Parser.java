import java.util.regex.Pattern;

public class Parser { // 유저 입력 받는 클래스
  // 입력받은 String을 숫자나 연산자로 변환하기 위해서 예외처리 필요함
  private static final String OPERATION_REG = "[+\\-*/]";
  private static final String NUMBER_REG = "^[0-9]*$";

  private final Calculator calculator = new Calculator();

  public Parser parseFirstNum(String firstInput) throws BadInputException{
    // 구현 1.
    if (!Pattern.matches(NUMBER_REG, firstInput)) {
      throw new BadInputException("정수값");
    }
    this.calculator.setFirstNumber(Integer.parseInt(firstInput));
    return this;
  }

  public Parser parseSecondNum(String secondInput) throws BadInputException{
    // 구현 1.
    if (!Pattern.matches(NUMBER_REG, secondInput)) {
      throw new BadInputException("정수값");
    }
    calculator.setSecondNumber(Integer.parseInt(secondInput));
    return this;
  }

  public Parser parseOperator(String operationInput) throws BadInputException{
    // 구현 1.
    if (!Pattern.matches(OPERATION_REG, operationInput)) {
      throw new BadInputException("사칙 연산의 연산자");
    }
    switch (operationInput) {
      case "+" -> this.calculator.setOperation(new AddOperation());
      case "-" -> this.calculator.setOperation(new SubstractOperation());
      case "*" -> this.calculator.setOperation(new MultiplyOperation());
      case "/" -> this.calculator.setOperation(new DivideOperation());
    }
    return this;
  }

  public double executeCalculator() {
    return calculator.calculate();
  }
}