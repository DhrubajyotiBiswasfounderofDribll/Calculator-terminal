import java.util.;

public class Calculator{
  public static void main(){
    int n = 10;
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    String operator = sc.nextLine();

    do{
      if(operator == "+" || operator == "plus"){
        System.out.printf("Sum of %d and %d", num1, num2 + (num1 + num2) + "\n");
      }
      else if(operator == "-" || operator == "minus"){
        System.out.printf("Subtraction of %d and %d", num1, num2 + (num1 - num2) + "\n");
      }
      else if(operator == "*" || operator == "multiply"){
        System.out.printf("Multiplication of %d and %d", num1, num2 + (num1 * num2) + "\n");
      }
      else if(operator == "/" || operator == "division"){
        System.out.printf("Divison of %d and %d", num1, num2 + (num1 / num2) + "\n");
      }
      else{
        System.out.println("Err");
      }

    }while(n==10);
  }
}
