package homeWork_3;

public class SeaBattle {

    public static void main(String[] args) {

        // 1. Создать игроков (запросить их имена с консоли).
        // 2. Создание кораблей и их расстановка по полям.
        // 3. Сам процесс игры (до тех пор, пока у одного из игроков не закончатся корабли).
        // 4. Объявление победителя.

        // Проверки:
        // 1. Во время расстановки кораблей они не должны соприкасаться или пересекаться друг с другом (даже углами).
        // 2. Во время расстановки корабли не должны выходить за пределы поля.
        // 3. В процессе игры координаты выстрела должны проверяться на корректность (не вышли ли за пределы поля,
        // не стреляли ли уже туда ранее).

        SetUpPlayers setup1player = new SetUpPlayers();
        setup1player.setUpPlayer();

        SetUpPlayers setup2player = new SetUpPlayers();
        setup2player.setUpPlayer();

        /**
         * получилась реализовать только половину задания:
         * - Создать игроков (запросить их имена с консоли).
         * - Создание кораблей и их расстановка по полям.
         * Проверки:
         * 1. Во время расстановки кораблей они не должны соприкасаться или пересекаться друг с другом (даже углами).
         * 2. Во время расстановки корабли не должны выходить за пределы поля.
         *
         * чувствую очень большие пробелы в знаниях, есть идеи но не знаю как их реализовать
         * Элементарно заставить два метода работать вместе уже проблемa
         */


    }
}
