package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {

    public static void main(String[] args) {
        Vehiculo miVehiculoFernandezHoyosMario2223;
        int stockActual = 0;

        miVehiculoFernandezHoyosMario2223 = new Vehiculo("Seat", 18000, 100);
        operativaVehiculosFernandezHoyosMario2223(miVehiculoFernandezHoyosMario2223, stockActual, 50);
    }

    private static void operativaVehiculosFernandezHoyosMario2223(Vehiculo miVehiculoFernandezHoyosMario2223, int stockActual, int cantidadVehiculo) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoFernandezHoyosMario2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }

        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoFernandezHoyosMario2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoFernandezHoyosMario2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
