package BT1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String[] inputList = {"khanh", "tâm", "hoàng", "linh"};
        Queue<String> queue = new LinkedList<>();
        for (String element: inputList) {
            queue.add(element);
        }
        System.out.println(queue);
    }
}
