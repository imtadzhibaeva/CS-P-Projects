
//ADD 34 3
//SUB 31 2

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("H1");

    Scanner scanner = new Scanner(System.in);

    String raw_expr = scanner.nextLine();
    String[] data = raw_expr.split(" ");
    if (data.length != 3 ) {
      throw new IllegalArgumentException("Input doesnt satisfy language rules: " + raw_expr);
    }

    scanner.close();
  }  
}
