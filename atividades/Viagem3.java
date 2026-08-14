import java.util.Scanner;
public class Viagem3 {
    void main (){
double combus, kms, litros, preco;
Scanner s=new Scanner (System.in);
IO.println("Quantos quilômetros serão percorridos na viagem?");
kms =s.nextDouble();
IO.println("Quantos custa o litro de combustivel?");
combus= s.nextDouble();
litros = (kms / 12);
if (kms > 500) { preco = (litros * combus * 0.95);

}
else {preco = (litros * combus);}

IO.println("A viagem vai custar: R$"+preco);
    }
    
    
}
