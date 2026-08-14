import java.util.Scanner;

public class Aluguel {


        void main() {
            double kms, total, taxa;
            int diaria;
            Scanner s=new Scanner(System.in);
            IO.println("Você alugou o carro por quantos dias?");
            diaria = s.nextInt();
            IO.println("Você andou quantos quilômetros com o carro?");
            kms = s.nextDouble();
            if (kms / diaria > 100){
                taxa = (kms / diaria - 100 );
                total = ( diaria * 200 + (taxa * 1.50));
            }
            else{
                total = (diaria * 200);

            }
            IO.println("O seu aluguel ficou um total de: R$" + total);

        }
    }