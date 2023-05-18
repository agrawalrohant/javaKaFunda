package learnings.functionalInterfaces;

@FunctionalInterface
interface A {
    void showMeYourPower();
    //void secondMethod(); <- not allowed as makred Functional Interface
}

class TryFunctional {

    public static void main(String[] args) {
        // @ ways to instantiate obj of A

        // 1. Using concrete class impl
        A obj1 = new B();
        obj1.showMeYourPower();

        // 2. Using annonimous Inner Class
        A obj2 = new A() {

            @Override
            public void showMeYourPower() {
                System.out.println("Haiiiii...Yaaahhhh.....");
            }

        };
        obj2.showMeYourPower();
    }
}

class B implements A {

    @Override
    public void showMeYourPower() {
        System.out.println("Yaaahhhh.....");
    }

}