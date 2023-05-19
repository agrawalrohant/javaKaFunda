package learnings.streams;

import java.util.*;
import java.util.stream.Stream;

public class UsingStrams {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6,5,1,2,3,4,7);

        // Stream way : shortcut
        int resultNew = arr.stream().filter(x -> x%2==0).map(y -> y*2).reduce(0, (a,b)-> a+b);
        System.out.println("Stream way : shortcut - "+resultNew);

        // Stream way : explained
        Stream<Integer> s1 = arr.stream();
        Stream<Integer> s2 = s1.filter(x -> x%2 == 0);
        Stream<Integer> s3 = s2.map(y -> y*2);
        int result = s3.reduce(0, (a,b)-> a+b);
        System.out.println("Stream way : explained - "+result);

        // Origian way
        int sum = 0;
        for(Integer n : arr){
            // Filter Even
            if(n%2 == 0){
                // doubble
                n = n*2;
                // addup
                sum += n;
            }
        }
        System.out.println("Origian way - "+sum);


    }
}
