package org.example;

public class Camelos {

    public double camelos, old, mid, bot, restante;

    public Camelos (double camelos){

       this.camelos = camelos;

    }

    public String saida(){
        old = (camelos / 2);
        mid = (camelos / 3);
        bot = (camelos / 9 );
        restante = camelos - old - mid - bot;
        return "O mais velho terá "+old+" camelos.\n"
        +"O do meio terá "+mid+" camelos.\n"
        + "O mais novo terá "+bot+" camelos.\n"
                +"E no fim ainda sobrará "+restante+" camelos!\n";
    }

}