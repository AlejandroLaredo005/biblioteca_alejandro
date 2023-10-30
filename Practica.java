package suma;

import java.util.Scanner;

public class Practica {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero para sumarlo: ");
    double numero1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce un numero para sumarlo: ");
    double numero2 = Double.parseDouble(sc.nextLine());
    System.out.println("La suma es " + (numero1 + numero2));
  }

}
