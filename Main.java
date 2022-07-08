public class Main {
    public static void main(String[] args) {

        ClaseSR csr = new ClaseSR();
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double a=respuesta.nextInt();
    
        System.out.println("Introduce el segundo numero: ");
        double b=respuesta.nextInt();

        System.out.println("El resultado de la suma es: " +  crs.suma(a,b));
    }
}
