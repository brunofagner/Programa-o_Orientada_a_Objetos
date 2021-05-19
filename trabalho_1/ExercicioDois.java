import java.util.Scanner;
public class ExercicioDois{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int money = scan.nextInt();
    int fifteen = money/50;
    money %= 50;
    int ten = money/10;
    money %= 10;
    int five = money/5;
    money %= 5;
    System.out.println(fifteen + " " + ten + " " + five + " " + money);
    scan.close();
  }
}