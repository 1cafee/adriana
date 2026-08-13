import java.util.Scanner;
public class Temperatura{

void main() {
    
IO.println("Qual mês você deseja ver? Escolha de 1-12");
Scanner s=new Scanner (System.in);
int resposta;
resposta = s.nextInt();
switch (resposta){
case 1 -> IO.println( "Janeiro - 24C, Temperatura Agradavel") ;
case 2 -> IO.println( "Fevereiro - 24C, Temperatura Agradavel") ;
        case 3 -> IO.println( "Março- 24C, Temperatura Agradavel" );
        case 4 -> IO.println( "Abril - 22C, Temperatura Agradavel") ;
        case 5 -> IO.println( "Maio - 19C, Temperatura Agradavel" );
        case 6 -> IO.println( "Junho - 18C, Temperatura Agradavel") ;
        case 7 -> IO.println( "Julho - 18C, Temperatura Agradavel" );
        case 8 -> IO.println( "Agosto - 19C, Temperatura Agradavel") ;
        case 9 -> IO.println( "Setembro - 20C, Temperatura Agradavel");
        case 10 -> IO.println("Outubro - 22C, Temperatura Agradavel" );
        case 11 -> IO.println( "Novembro - 23C, Temperatura Agradavel" );
        case 12 -> IO.println("Dezembro - 24C, Temperatura Agradavel") ;



}
}

}