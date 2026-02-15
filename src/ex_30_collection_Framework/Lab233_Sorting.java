import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab233_Sorting {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        marks.add(91);
        marks.add(89);
        marks.add(45);

        System.out.println("Original: " + marks);

        Collections.sort(marks);
        System.out.println("Ascending: " + marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Descending: " + marks);

    }
}
