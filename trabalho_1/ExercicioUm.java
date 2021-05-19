import java.util.Scanner;
public class ExercicioUm {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o preço da gasolina:");
    float gasolinePrice = scan.nextFloat();
    System.out.println("Digite o preço do etanol:");
    float ethanolPrice = scan.nextFloat();
    
    float theBest = ethanolPrice/gasolinePrice;

    if(theBest <= 0.7){
      System.out.println("Abasteça com etanol.");
    }else{
      System.out.println("Abasteça com gasolina.");
    }
  scan.close();
  }
}
