
public class Desconto{
    void main() {
int arroz = 30, feijao = 20, oleo= 7, acucar = 4, cafe = 30, macarrao = 3, farinha = 6, fuba = 3, molho =3, sal = 3;
double subtotal = arroz + feijao + oleo + acucar + cafe + macarrao + farinha + fuba + molho + sal;
double desconto;
if (subtotal > 100){
    desconto = (subtotal - (subtotal * 0.10));

}
else {desconto = subtotal;
}
    IO.println("1 Arroz: R$30,00");
    IO.println("1 Feijao: R$20,00");
    IO.println("1 Oleo R$7,00");
    IO.println("1 Acucar R$4,00");
    IO.println("1 Cafe R$30,00");
    IO.println("1 Macarrao R$3,00");
    IO.println("1 Farinha R$6,00");
    IO.println("1 Fuba R$3,00");
    IO.println("1 Molho R$3,00");
    IO.println("1 Sal R$3,00");
    IO.println("Subtotal: R$" +subtotal);
    IO.println("Total: R$" +desconto);

    }
}