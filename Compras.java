
/**
 * Write a description of class Compras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Compras
{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Farmacia miFarmacia = new Farmacia("123456","Balmoral","Fusa");
        String identificacion, nombre, sucursal;
            
        double promedio = 0;
            
        System.out.println("Digite el numero de clientes que compraron helados: ");
        int numClientes1 = sc.nextInt();
        for(int i = 0; i < numClientes1; i++){
            double compra1, compra2;
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el sucursal del cliente: ");
            sucursal = sc.next();
            System.out.println("Digite primera compra del cliente: ");
            compra1 = sc.nextDouble();
            System.out.println("Digite segunda compra del cliente: ");
            compra2 = sc.nextDouble();            
            miFarmacia.adicionarClienteHelado(identificacion, nombre, sucursal, compra1, compra2);
        }
                    
        System.out.println("Digite el numero de clientes que compraron cosméticos: ");
        int numClientes2 = sc.nextInt();
        for(int i = 0; i < numClientes2; i++){
            double compra1, compra2, compra3;
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el sucursal del cliente: ");
            sucursal = sc.next();
            System.out.println("Digite primera compra del cliente: ");
            compra1 = sc.nextDouble();
            System.out.println("Digite segunda compra del cliente: ");
            compra2 = sc.nextDouble();
            System.out.println("Digite tercera compra del cliente: ");
            compra3 = sc.nextDouble();
            miFarmacia.adicionarClienteCosmeticos(identificacion, nombre, sucursal, compra1, compra2, compra3);
        }
            
        System.out.println("Digite el numero de clientes que compraron medicamentos: ");
        int numClientes3 = sc.nextInt();
        for(int i = 0; i < numClientes3; i++){
            double compra1, compra2, compra3, compra4;            
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el sucursal del cliente: ");
            sucursal = sc.next();
            System.out.println("Digite primera compra del cliente: ");
            compra1 = sc.nextDouble();
            System.out.println("Digite segunda compra del cliente: ");
            compra2 = sc.nextDouble();
            System.out.println("Digite tercera compra del cliente: ");
            compra3 = sc.nextDouble();         
            System.out.println("Digite cuarta compra del cliente: ");
            compra4 = sc.nextDouble();  
            miFarmacia.adicionarClienteMedicamento(identificacion, nombre, sucursal, compra1, compra2, compra3, compra4);
        }
        
        promedio = miFarmacia.calcularPromedioCompras();
        System.out.println("\n El promedio de compras es: " + promedio); 
    }
}
