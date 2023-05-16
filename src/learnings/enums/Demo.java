package learnings.enums;
import java.util.*;

enum Laptops {
    Mackbook(100), XPS(120), Surface(200), ThinkPad(80);

    private int price;

    private Laptops(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptops() {
    }
}

enum Status {
    Running,
    Pending,
    Failed,
    Success;
}


public class Demo {

    //@SuppressWarnings("unchecked")
    public static void main2(String args[]) {
        ArrayList list = new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for (Object obj : list)
            System.out.println(obj);

    }

    public static void main(String[] args) {

        System.out.println(Laptops.Mackbook.getClass().getSuperclass());

        Laptops.ThinkPad.setPrice(199);
        System.out.println(Laptops.ThinkPad.getPrice());

        // Printing the value
        System.out.println(Status.Running);

        // getting sequence number
        System.out.println(Status.Failed.ordinal());

        // get for all
        Status[] currentStatus = Status.values();
        for (Status i : currentStatus) {
            System.out.println(i.ordinal() + " : " + i);
        }
    }

}
