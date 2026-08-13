import java.util.Scanner;

public class Mutiplo {



void main() {
    int num1;
    int num2;
    int result;
    Scanner s=new Scanner(System.in);
    IO.println ("Digite um número");
    num1=s.nextInt();
    IO.println("Digite outro número");
    num2=s.nextInt();
    IO.println("soma = " + (num1 + num2));
    
    result = num1 % num2;

    if (result == 0){
        IO.println("Os números são multilplos.");
    }
    else IO.println("Os números não são multiplos");
}
}