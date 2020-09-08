package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        new Task1().run();
    }

    private void run(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,2,3,7,8,18,11,17,15,14,12));
        list.removeIf(elem-> elem%2 != 0);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)%2 != 0) list.remove(i);
//            else i++;
//        }
        for (Integer x : list) {
            System.out.print(x+" ");
        }
        Optional<Integer> first = list.stream().filter(x-> x >= 10).findFirst();
        first.ifPresent(System.out::println);
        first.ifPresent(x->{

        });
    }
}
