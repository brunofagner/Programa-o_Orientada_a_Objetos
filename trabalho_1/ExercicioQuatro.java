import java.util.Scanner;
public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number, numbers[], srebmun[],j = 9;
    numbers = new int[10];
    srebmun = new int[10];
    for(int i = 0; i <= 9; i++){ 
      System.out.print("Digite um numero: ");
      number = scan.nextInt();
      numbers[i] = number;
      srebmun[j] = number;
      j--;
    }
    for(int i = 0; i <= 9; i++){
      System.out.println("Vetor numero["+i+"] = "+numbers[i]);
    }
    for(int i = 0; i <= 9; i++){
      System.out.println("Vetor invertido["+i+"] = "+srebmun[i]);
    }
    scan.close();
  }
}
