package org.example;
public class Viagem3 {
       public double combus, kms, litros, preco;


     public Viagem3 (double kms, double combus) {
     this.combus = combus;
     this.kms = kms;

     }
public String calcviagem() {
    litros = (kms / 12);
    if (kms > 500) {
        preco = (litros * combus * 0.95);

    } else {
        preco = (litros * combus);
    }

    return "A viagem vai custar: R$" + preco;
}
    }


