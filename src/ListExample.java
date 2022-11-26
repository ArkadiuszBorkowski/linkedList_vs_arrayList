import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
/*        double[] numbers = new double[3];
        numbers[0] = 2.2;
        numbers[1] = 3.3;
        numbers[2] = 4.4;

        System.out.println("Stara tablica:");
        System.out.println(Arrays.toString(numbers));

        double[] numbersCopy = Arrays.copyOf(numbers, 10);

        System.out.println("Nowa tablica");
        System.out.println(Arrays.toString(numbersCopy));     */

        /*
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);

        System.out.println(list);
        System.out.println(list.get(0));
        */

        ArrayList<Double> list = new ArrayList<>();
        System.out.println(list.size());
        for (int i = 0; i < 100; i++) {
            list.add((double) i);
        }

        System.out.println(list.get(50));
        System.out.println("Liczba elementów na liście " + list.size());

        list.remove(2);
        list.remove(5.0);
        //list.clear();  - usuwa wszystko z tablicy

        System.out.println(list.size());
        System.out.println("Liczba elementów na liście " + list.size());


        // LISTY TABLICOWE:

        List<Double> listLinked = new LinkedList <>();

        ArrayList<Double> arrayList = new ArrayList<>();

        System.out.println(listLinked.size());

        for (int i = 0; i < 100; i++) {
            listLinked.add((double) i);
            arrayList.add((double) i);
        }

        printList(arrayList);
    }



        private static void printList (List <Double> list) {
            for (Double element : list) {
                System.out.println(element);
            }
        }
}




