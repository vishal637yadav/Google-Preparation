package ds.arrayslist;

import java.util.ArrayList;

public class DemoArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Me added");
        System.out.println("list :->"+list);

        System.out.println("list.contains(\"Me added\") ::"+list.contains("Me added"));

    }


}
