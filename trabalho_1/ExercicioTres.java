
import java.util.Scanner;

public class ExercicioTres {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int soma = 0;
    int position = scan.nextInt();
    if(position == 0 || position == 1){
      soma = 1;
    }else{
      for(int i = 0; i <= position; i++){
        soma = a + b;
        a = b;
        b = soma;
      }
    }
    System.out.println(soma);
    scan.close();
  }
}
