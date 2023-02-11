import java.util.ArrayList;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println(list);
        int max = 0;
        int min = 99;
        int sum = 0;
        double med = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (list.get(i) < min){
                min = list.get(i);
            }
            sum += list.get(i);           
        }
        double x = sum;
        med = x / list.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("ср = " + med);
    }
}
