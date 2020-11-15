import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a,b,z;
    a = input.nextInt();
    b = input.nextInt();
    if(b > a)
    {
        System.out.printf("O JOGO DUROU %d HORA(S)\n", b - a);
    }
    if(a == b)
    {
        System.out.printf("O JOGO DUROU 24 HORA(S)\n");
    }
    if(a > b)
    {
        z = 24 - a + b;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", z);
    }
  }  
}
