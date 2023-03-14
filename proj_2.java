import java.util.LinkedList;
import java.util.Scanner;

public class proj_2 {
    public static void main(String[] args) {
        LinkedList<Integer> states = new LinkedList<Integer>();
        fillList(states);
        System.out.print("Исходный массив: ");
        printList(states);
        dequeue(states);
        System.out.print("\nПолученный массив: ");
        printList(states);
        enqueue(states);
        System.out.print("\nПолученный массив: ");
        printList(states);

        first(states);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> states) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число, которое хотите добавить: ");
        int n = in.nextInt();
        states.addLast(n);
        System.out.println("Элемент добавлен!");
        in.close();
        return states;
    }

    public static void dequeue(LinkedList<Integer> states) {
        int num = states.getFirst();
        System.out.printf("Первый элемент в списке: %s \n", states.getFirst());
        states.removeFirst();
        System.out.printf("Элемент %d удален из очереди!\n", num);
    }

    public static void first(LinkedList<Integer> states) {
        int num = states.getFirst();
        System.out.printf("Первый элемент в очереди %d", num);
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