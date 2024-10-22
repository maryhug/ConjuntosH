import java.util.Scanner;

public class ConjuntosMenu {
    public static void main(String[] args) {
        Metodos menu = new Metodos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese los elementos para el Conjunto 1:");
        menu.setConjunto1(menu.ingresarConjunto());

        System.out.println("Ingrese los elementos para el Conjunto 2:");
        menu.setConjunto2(menu.ingresarConjunto());

        do {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Mostrar Conjuntos");
            System.out.println("2. Cantidad de Elementos");
            System.out.println("3. Verificar si un Elemento Pertenece");
            System.out.println("4. Insertar Elemento");
            System.out.println("5. Unión de Conjuntos");
            System.out.println("6. Eliminar Duplicados");
            System.out.println("7. Intersección");
            System.out.println("8. Verificar Igualdad");
            System.out.println("9. Subconjunto");
            System.out.println("10. Complemento");
            System.out.println("11. Diferencia");
            System.out.println("12. Diferencia Simétrica");
            System.out.println("13. Eliminar Elemento");
            System.out.println("14. Obtener Posición de un Elemento");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menu.mostrarConjunto();
                    break;
                case 2:
                    menu.cantidadElementos();
                    break;
                case 3:
                    menu.pertenece();
                    break;
                case 4:
                    menu.insertarElemento();
                    break;
                case 5:
                    menu.union();
                    break;
                case 6:
                    menu.eliminarDuplicados();
                    break;
                case 7:
                    menu.interseccion();
                    break;
                case 8:
                    menu.igualdad();
                    break;
                case 9:
                    menu.esSubconjunto();
                    break;
                case 10:
                    menu.complemento();
                    break;
                case 11:
                    menu.diferencia();
                    break;
                case 12:
                    menu.diferenciaSimetrica();
                    break;
                case 13:
                    menu.eliminarElemento();
                    break;
                case 14:
                    menu.obtenerPosicion();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
