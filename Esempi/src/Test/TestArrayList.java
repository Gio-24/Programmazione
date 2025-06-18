package Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

    public static void main(String[] args) {
        // 1. Creazione di un ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("ArrayList creato: " + fruits);
        
        // 2. add() - Aggiunta elementi
        fruits.add("Mela");
        fruits.add("Banana");
        fruits.add("Arancia");
        System.out.println("Dopo aggiunta elementi: " + fruits);
        
        // 3. size() - Dimensione della lista
        System.out.println("Numero di elementi: " + fruits.size());
        
        // 4. get() - Accesso agli elementi
        System.out.println("Elemento in posizione 1: " + fruits.get(1));
        
        // 5. set() - Modifica elemento
        fruits.set(0, "Mela Rossa");
        System.out.println("Dopo modifica primo elemento: " + fruits);
        
        // 6. remove() - Rimozione elemento
        fruits.remove(2);
        System.out.println("Dopo rimozione terzo elemento: " + fruits);
        
        // 7. contains() - Verifica presenza
        System.out.println("Contiene 'Banana'? " + fruits.contains("Banana"));
        System.out.println("Contiene 'Pera'? " + fruits.contains("Pera"));
        
        // 8. indexOf() - Posizione elemento
        System.out.println("Indice di 'Banana': " + fruits.indexOf("Banana"));
        
        // 9. isEmpty() - Lista vuota
        System.out.println("La lista è vuota? " + fruits.isEmpty());
        
        // 10. clear() - Svuotamento lista
        fruits.clear();
        System.out.println("Dopo clear(): " + fruits);
        System.out.println("La lista è vuota ora? " + fruits.isEmpty());
        
        // 11. addAll() - Aggiunta di una collezione
        ArrayList<String> moreFruits = new ArrayList<>(Arrays.asList("Pera", "Uva", "Kiwi"));
        fruits.addAll(moreFruits);
        System.out.println("Dopo addAll(): " + fruits);
        
        // 12. toArray() - Conversione in array
        Object[] fruitsArray = fruits.toArray();
        System.out.println("Array convertito: " + Arrays.toString(fruitsArray));
        
        // 13. clone() - Clonazione della lista
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();
        System.out.println("Lista clonata: " + clonedList);
        
        // 14. forEach() - Iterazione
        System.out.print("Elementi della lista: ");
        fruits.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();
        
        // 15. removeIf() - Rimozione condizionale
        fruits.removeIf(fruit -> fruit.startsWith("U"));
        System.out.println("Dopo removeIf (rimuove elementi che iniziano con 'U'): " + fruits);
    }
}
