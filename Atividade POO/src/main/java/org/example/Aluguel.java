package org.example;

public class Aluguel {
       public double kms, diaria, total, taxa;


    public Aluguel(int diaria, double kms) {
        this.diaria = diaria;
        this.kms = kms;
    }

public String calcaluguel(){
        if (kms / diaria > 100){
            taxa = (kms / diaria - 100 );
            total = ( diaria * 200 + (taxa * 1.50));
        }
        else{
            total = (diaria * 200);

        }
        return"O seu aluguel ficou um total de: R$" + total;

    }
}