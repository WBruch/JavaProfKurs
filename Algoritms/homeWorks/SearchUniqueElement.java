package homeWorks;

/**
 * Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим),
 * а один элемент появляется только один раз.
 * Написать метод для нахождения этого элемента. Определить асимптотическую сложность алгоритма.
 */
public class SearchUniqueElement {
    public static void main(String[] args) {

        int[] test = {1, 1, 2, 2, 3, 3, 4, 4, 5, 45, 5, 6, 6, 7, 7, 8, 8, 9, 9, 0, 0};
        System.out.println(searchUniqElem(test));
    }

    private static int searchUniqElem(int[] array) {
        int x = 0;
        for (int i : array) {
            x ^= i; // x = x ^ i
        }
        return x;
    }

    /**
     *  Я думаю сложность данного алгоритма квадратичная O(n), т.к. мы взаимодействуем с каждым элементом массива только один раз,
     * и с ростом числа входных данных, количесво операций будет увеличиваться линейно.
     */
}