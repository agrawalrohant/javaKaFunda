package learnings.comparing;

import java.util.*;

public class UsingComparator {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Shweta");
        arr.add("Rohant");
        arr.add("Agrawal");
        arr.add("Anvi");

        Comparator<String> compOnLength = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;

        Collections.sort(arr,compOnLength);

        System.out.println(arr);

    }
}
