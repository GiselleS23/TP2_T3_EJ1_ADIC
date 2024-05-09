/* 1.- Escriba un diagrama que calcule el área de N triángulos rectángulos, dada la altura y la base.
Sacchetti, Maria Giselle C2*/


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n;
    double base, altura, area;
    System.out.print("Ingresar el número de triangulos rectangulos a calcular: ");
    n = scanner.nextInt();
    
    for (int i = 1; i <= n; i++){
      System.out.println("Triángulo n° " + i);
      System.out.print("Ingresar la base: ");
      base = scanner.nextDouble();
      System.out.print("Ingresar la altura: ");
      altura = scanner.nextDouble();
      area = (base * altura) / 2;
      System.out.println("El área del triángulo " + i + " es: " + area);
    }
    scanner.close();
  }
}