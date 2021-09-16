import java.util.Scanner;
 
public class CalcuIMC {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double p,e,imc;
        System.out.println("¿Cual es su peso? ");
        p= teclado.nextDouble();
        System.out.println("¿Cual es tu estatura? ");
        e= teclado.nextDouble();
        imc= p/(e*e);
        System.out.println("Tu IMC es: "+imc);
        if (imc<18.5) {
            System.out.println("Tienes peso BAJO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("Tienes el peso Normal");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("Tienes SOBREPESO");
        } else {
            System.out.println("Ya estas en OBESIDAD");
        }
    }
 
}