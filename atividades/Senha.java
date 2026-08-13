import java.util.Scanner;

public class Senha {

    void main() {
int senha;
int senhacorreta;
Scanner sc =new Scanner(System.in);
IO.println("Insira sua senha.");
senha= sc.nextInt();
senhacorreta = 1234;
if (senha == senhacorreta){
IO.println("Acesso permitido.");
}
else IO.println("Acesso negado.");
}
}
