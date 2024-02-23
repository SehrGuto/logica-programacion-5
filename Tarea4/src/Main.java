import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("árbol", "tree");
        diccionario.put("coche", "car");
        diccionario.put("ordenador", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("pelota", "ball");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "boy");
        diccionario.put("niña", "girl");
        diccionario.put("agua", "water");
        diccionario.put("leche", "milk");
        diccionario.put("pan", "bread");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");

        // Obtener 5 palabras al azar del diccionario
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }

        // Pedir al usuario que ingrese las traducciones y comprobar si son correctas
        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;
        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
            String traduccionUsuario = scanner.nextLine().trim().toLowerCase();

            String traduccionCorrecta = diccionario.get(palabraEspañol);
            if (traduccionCorrecta != null && traduccionCorrecta.equalsIgnoreCase(traduccionUsuario)) {
                System.out.println("¡Correcto!");
                puntaje++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + traduccionCorrecta + "'.");
            }
        }

        // Mostrar puntaje final
        System.out.println("Tu puntaje final es: " + puntaje + "/5");

        // Cerrar el scanner
        scanner.close();
    }
}