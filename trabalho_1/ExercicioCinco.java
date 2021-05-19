import java.util.Scanner;
public class ExercicioCinco {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int total = 0, quant = 0, number = 0,
    minNumber = Integer.MAX_VALUE, maxNumber = Integer.MIN_VALUE;
    float media;
    while(number != -1){
      number = scan.nextInt();
      if(number == -1){
        break;
      }
      if(number > maxNumber){
        maxNumber = number;
      }
      if(number < minNumber){
        minNumber = number;
      }
      total += number;
      quant++;
    }
    media = total/quant;
    System.out.println("Foram digitados "+quant+" numeros.");
    System.out.println("O maior numero digitado foi: "+ maxNumber);
    System.out.println("O menor numero digitado foi: "+ minNumber);
    System.out.print("A media dos numeros foi: "+ media);
    scan.close();
  }
}
