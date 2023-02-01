import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(5);
//        list.add(24);
//        System.out.println(list);
        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);
    }
}
