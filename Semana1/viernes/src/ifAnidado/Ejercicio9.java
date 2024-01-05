package ifAnidado;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de compra");
        float montoCompra = sc.nextFloat();
        float descuento = 0;
        if(montoCompra>1000){
            if(montoCompra>2000)
            {
                descuento = 0.2f;
            }
            else
            {
                descuento = 0.1f;
            }
        }

        float valorDescuento = montoCompra*descuento;
        System.out.println(valorDescuento);
    }
}
