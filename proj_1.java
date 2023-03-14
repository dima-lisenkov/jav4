import java.util.LinkedList;
import java.util.ListIterator;



public class proj_1 {

    public static void main(String[] args) {

        LinkedList<Integer> states = new LinkedList<Integer>();

        fillList(states);
        System.out.println("Исходный массив: ");
        printList(states);
        ListIterator<Integer> listIterator = states.listIterator(states.size());
        System.out.println("Перевернутный массив: ");
        while (listIterator.hasPrevious()) {
            System.out.printf("%d ", listIterator.previous());
        }

    }

    public static void fillList(LinkedList<Integer> states) {
        for (int i = 0; i < 10; i++) {
            states.add(((int) (Math.random() * 10)));
        }
    }

    public static void printList(LinkedList<Integer> states) {
        for (Integer integer : states) {
            System.out.printf("%d ", integer);
        }
        System.out.println("\n");
    }

}