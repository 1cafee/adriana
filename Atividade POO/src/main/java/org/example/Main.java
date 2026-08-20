import org.example.*;


void main () {
IO.println("Qual programa você deseja executar?");
    IO.println("1- Multiplos");
    IO.println("2- Senha");
    IO.println("3- Camelos");
    IO.println("4- Descontos");
    IO.println("5- Temperatura");
    IO.println("6- Viagem");
    IO.println("7- Aluguel");


    Scanner s= new Scanner (System.in);
int escolha = s.nextInt();


    if(escolha==1){
        IO.println("Você escolheu Multiplos!");
        IO.println("");
        IO.println("Digite um número");
        int num1 = s.nextInt();
        IO.println("Digite outro número");
        int num2 = s.nextInt();
        Mutiplo end = new Mutiplo(num1, num2);

        IO.println(end.resposta());

    }
    if(escolha==2){
        IO.println("Você escolheu Senha!");
        IO.println("");
        IO.println("Insira sua senha.");
        int senha = s.nextInt();
        int senhacorreta = 1234;
        Senha senhazona = new Senha (senha, senhacorreta);
                IO.println(senhazona.senhuda());
    }
    if(escolha==3){
        IO.println("Você escolheu Camelos!");
        IO.println("");
        IO.println("Insira quantos camelos serão dividos entre os 3 irmãos.");
        double camelos = s.nextDouble();
        double old, mid, bot;
        Camelos loscamel = new Camelos (camelos);
        IO.println(loscamel.saida());





    }
    if(escolha==4){
        IO.println("Você escolheu Descontos!\n");
        Descontos.execute();


    }
    if(escolha==5){
        IO.println("Você escolheu Temperatura!\n");
        Temperatura.execute();
    }
    if(escolha==6){
        IO.println("Você escolheu Viagem!\n");
    IO.println("Quantos quilômetros serão percorridos na viagem?\n");
    double kms = s.nextDouble();
        IO.println("Quantos custa o litro de combustivel?\n");
    double combus= s.nextDouble();
    Viagem3 viagem = new Viagem3(kms, combus);
    IO.println(viagem.calcviagem());


    }
    if(escolha==7){
    IO.println("Você escolheu Aluguel!\n");
        IO.println("Você alugou o carro por quantos dias?\n");
        int diaria = s.nextInt();
        IO.println("Você andou quantos quilômetros com o carro?\n");
        double kms = s.nextDouble();
        Aluguel alugas = new Aluguel(diaria, kms);
        IO.println(alugas.calcaluguel());


    }

}