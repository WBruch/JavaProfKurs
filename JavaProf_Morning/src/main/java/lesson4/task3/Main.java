package lesson4.task3;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {2, 4, 7, 44, 2, 9, 3};

        //napisat metod kotoryi summiruet vse zna4enia

        int sum = getSumOfArray(numbers);
        System.out.println("sum of array is " + sum);
    }

    public static Integer getSumOfArray(Integer[] array) {
        int sum = 0;
        for(Integer current : array) {
            sum += current;
        }
        return sum;
    }
}
