import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ConjuntoMenu {

    private static List<Integer> conjunto1 = new ArrayList<>();
    private static List<Integer> conjunto2 = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        System.out.println("Ingrese los elementos del Conjunto 1:");
        conjunto1 = ingresarConjunto();

        System.out.println("Ingrese los elementos del Conjunto 2:");
        conjunto2 = ingresarConjunto();

        do {
            System.out.println("\n--- Menú de Operaciones con Conjuntos ---");
            System.out.println("1. Mostrar");
            System.out.println("2. Cantidad de elementos");
            System.out.println("3. Pertenece o no");
            System.out.println("4. Insertar al final");
            System.out.println("5. Unión");
            System.out.println("6. Eliminar duplicado");
            System.out.println("7. Intersección");
            System.out.println("8. Igualdad");
            System.out.println("9. Subconjunto");
            System.out.println("10. Complemento");
            System.out.println("11. Diferencia");
            System.out.println("12. Diferencia simétrica");
            System.out.println("13. Eliminar");
            System.out.println("14. Posición");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarConjunto();
                    break;
                case 2:
                    cantidadElementos();
                    break;
                case 3:
                    pertenece();
                    break;
                case 4:
                    insertarElemento();
                    break;
                case 5:
                    union();
                    break;
                case 6:
                    eliminarDuplicados();
                    break;
                case 7:
                    interseccion();
                    break;
                case 8:
                    igualdad();
                    break;
                case 9:
                    esSubconjunto();
                    break;
                case 10:
                    complemento();
                    break;
                case 11:
                    diferencia();
                    break;
                case 12:
                    diferenciaSimetrica();
                    break;
                case 13:
                    eliminarElemento();
                    break;
                case 14:
                    obtenerPosicion();
                    break;
                case 15:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 15);
    }

    public static List<Integer> ingresarConjunto() {
        List<Integer> conjunto = new ArrayList<>();
        System.out.println("Ingrese los elementos separados por espacio (ingrese '-' para terminar):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("-")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                conjunto.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return conjunto;
    }

    public static void mostrarConjunto() {
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
    }

    public static void cantidadElementos() {
        System.out.println("¿Con cuál conjunto desea trabajar? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            System.out.println("Cantidad de elementos en Conjunto 1: " + conjunto1.size());
        } else if (conjuntoSeleccionado == 2) {
            System.out.println("Cantidad de elementos en Conjunto 2: " + conjunto2.size());
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void pertenece() {
        System.out.print("Ingrese el elemento a verificar: ");
        int elemento = scanner.nextInt();

        System.out.println("¿Con cuál conjunto desea trabajar? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            if (conjunto1.contains(elemento)) {
                System.out.println("El elemento " + elemento + " pertenece al Conjunto 1.");
            } else {
                System.out.println("El elemento " + elemento + " NO pertenece al Conjunto 1.");
            }
        } else if (conjuntoSeleccionado == 2) {
            if (conjunto2.contains(elemento)) {
                System.out.println("El elemento " + elemento + " pertenece al Conjunto 2.");
            } else {
                System.out.println("El elemento " + elemento + " NO pertenece al Conjunto 2.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void insertarElemento() {
        System.out.print("Ingrese el elemento a insertar: ");
        int elemento = scanner.nextInt();

        System.out.println("¿En cuál conjunto desea insertar? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            conjunto1.add(elemento);
            System.out.println("Elemento insertado en Conjunto 1.");
        } else if (conjuntoSeleccionado == 2) {
            conjunto2.add(elemento);
            System.out.println("Elemento insertado en Conjunto 2.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void union() {
        HashSet<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("Unión de Conjunto 1 y Conjunto 2: " + union);
    }

    public static void eliminarDuplicados() {
        System.out.println("¿En cuál conjunto desea eliminar duplicados? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            HashSet<Integer> conjuntoSinDuplicados = new HashSet<>(conjunto1);
            conjunto1.clear();
            conjunto1.addAll(conjuntoSinDuplicados);
            System.out.println("Se han eliminado los duplicados en Conjunto 1: " + conjunto1);
        } else if (conjuntoSeleccionado == 2) {
            HashSet<Integer> conjuntoSinDuplicados = new HashSet<>(conjunto2);
            conjunto2.clear();
            conjunto2.addAll(conjuntoSinDuplicados);
            System.out.println("Se han eliminado los duplicados en Conjunto 2: " + conjunto2);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void interseccion() {
        HashSet<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("Intersección de Conjunto 1 y Conjunto 2: " + interseccion);
    }

    public static void igualdad() {
        if (new HashSet<>(conjunto1).equals(new HashSet<>(conjunto2))) {
            System.out.println("Los conjuntos son iguales.");
        } else {
            System.out.println("Los conjuntos NO son iguales.");
        }
    }

    public static void esSubconjunto() {
        if (new HashSet<>(conjunto1).containsAll(new HashSet<>(conjunto2))) {
            System.out.println("Conjunto 2 es subconjunto de Conjunto 1.");
        } else {
            System.out.println("Conjunto 2 NO es subconjunto de Conjunto 1.");
        }
    }

    public static void complemento() {
        HashSet<Integer> complemento = new HashSet<>(conjunto1);
        complemento.removeAll(conjunto2);
        System.out.println("Complemento de Conjunto 1 respecto a Conjunto 2: " + complemento);
    }

    public static void diferencia() {
        HashSet<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("Diferencia entre Conjunto 1 y Conjunto 2: " + diferencia);
    }

    public static void diferenciaSimetrica() {
        HashSet<Integer> diferenciaSimetrica = new HashSet<>(conjunto1);
        diferenciaSimetrica.addAll(conjunto2);
        HashSet<Integer> temp = new HashSet<>(conjunto1);
        temp.retainAll(conjunto2);
        diferenciaSimetrica.removeAll(temp);
        System.out.println("Diferencia simétrica entre Conjunto 1 y Conjunto 2: " + diferenciaSimetrica);
    }

    public static void eliminarElemento() {
        System.out.print("Ingrese el elemento a eliminar: ");
        int elemento = scanner.nextInt();

        System.out.println("¿De cuál conjunto desea eliminar el elemento? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            if (conjunto1.remove((Integer) elemento)) {
                System.out.println("Elemento eliminado del Conjunto 1.");
            } else {
                System.out.println("El elemento no se encontró en el Conjunto 1.");
            }
        } else if (conjuntoSeleccionado == 2) {
            if (conjunto2.remove((Integer) elemento)) {
                System.out.println("Elemento eliminado del Conjunto 2.");
            } else {
                System.out.println("El elemento no se encontró en el Conjunto 2.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void obtenerPosicion() {
        System.out.print("Ingrese el elemento a buscar: ");
        int elemento = scanner.nextInt();

        System.out.println("¿En cuál conjunto desea buscar el elemento? (1 o 2):");
        int conjuntoSeleccionado = scanner.nextInt();

        if (conjuntoSeleccionado == 1) {
            int index = conjunto1.indexOf(elemento);
            if (index != -1) {
                System.out.println("El elemento se encuentra en la posición: " + index + " del Conjunto 1.");
            } else {
                System.out.println("El elemento no se encuentra en el Conjunto 1.");
            }
        } else if (conjuntoSeleccionado == 2) {
            int index = conjunto2.indexOf(elemento);
            if (index != -1) {
                System.out.println("El elemento se encuentra en la posición: " + index + " del Conjunto 2.");
            } else {
                System.out.println("El elemento no se encuentra en el Conjunto 2.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
