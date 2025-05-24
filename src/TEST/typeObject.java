package TEST;

import java.util.ArrayList;

public class typeObject {
    static ArrayList<Object> a = new ArrayList<>();

    public static void main(String[] args) {
        a.add(2);
        a.add("adarsh");
        a.add('a');
        a.add(23.56f);
        a.add(78L);

        System.out.println(a);
    }

}
