package learnings.lamda;

@FunctionalInterface
interface A {
    void showMeYourPower();
}

@FunctionalInterface
interface B {
    void giveMeANumber(int i);
}

@FunctionalInterface
interface C {
    boolean guessFavNumber(int i[]);
}

public class TryLamda {
    public static void main(String[] args) {

        // Before Lamda came
        A obj2 = new A() {
            @Override
            public void showMeYourPower() {
                System.out.println("Haiiiii...Yaaahhhh.....");
            }

        };
        obj2.showMeYourPower();

        // After Lamda came
        A obj3 = () -> System.out.println("Huuu...Yaaahhhh.....");
        obj3.showMeYourPower();

        // With input
        B obj4 = i -> System.out.println("You gave me number : " + i);
        obj4.giveMeANumber(10000000);

        // with return type
        C obj5 = arr -> arr[0] > 5?true:false;
        int[] myIntArray = {10, 2, 3};
        System.out.println(obj5.guessFavNumber(myIntArray));
    }

}
