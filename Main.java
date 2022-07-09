import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        OperacionesBinarias opbin= new OperacionesBinarias();
        ClaseSR csr = new ClaseSR();
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double a=respuesta.nextInt();
    
        System.out.println("Introduce el segundo numero: ");
        double b=respuesta.nextInt();

        System.out.println("El resultado de la suma es: " +  csr.suma(a,b));


        System.out.println("teclea el primer nunmero: ");
        double num1=respuesta.nextInt();
    
        System.out.println("teclea el segundo numero: ");
        double num2=respuesta.nextInt();

        System.out.println("el resultado es: " + opbin.multiplicacion(num1,num2));
    }
}
