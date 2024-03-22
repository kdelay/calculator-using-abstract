import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int firstNumber = Integer.parseInt(sc.nextLine());
    int secondNumber = Integer.parseInt(sc.nextLine());

    Calculator calculator = new Calculator(new AddOperation());
    System.out.println(calculator.calculate(firstNumber, secondNumber));
  }
}