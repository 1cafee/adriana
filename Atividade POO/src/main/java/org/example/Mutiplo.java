package org.example;

import java.util.Scanner;

public class Mutiplo {
public int num1, num2;

public Mutiplo (int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
}

        public String resposta(){
        double result;
        result = num1 % num2;

        if (result == 0) {
            return "Os números são multilplos.";
        } else{ return "Os números não são multiplos.";
    }
}
}
