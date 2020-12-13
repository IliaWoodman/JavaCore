package MultiTreadingLessons;

public class Game {public static void main(String[] args) {
    //Execution time: 11 ms
    long startTime = System.currentTimeMillis();
    System.out.println("Result: " + getMinutes(6));
    System.out.println("\nExecution time: " + (System.currentTimeMillis() - startTime) + " ms");
    //Result: 15
}

    private static int getMinutes(int timeAllHours) {
        int timeAllMinutes = timeAllHours * 60;
        int timeTogether = 0;

        String[] headFirst = {"forward", "back", "left", "right"};
        String[] headSecond = {"back", "left", "right"};
        String[] headThird = {"right", "left", "forward"};
        int turnTimeFH = 10;
        int turnTimeSH = 15;
        int turnTimeTH = 20;

        //каждые 5 минут проверяем куда смотрят все головы. направление одно - +5 минут в копилку
        for (int i = 0; i <= timeAllMinutes; i += 5) {
            if (headFirst[currElem(headFirst, turnTimeFH, i)].equals(headSecond[currElem(headSecond, turnTimeSH, i)])
                && headFirst[currElem(headFirst, turnTimeFH, i)].equals(headThird[currElem(headThird, turnTimeTH, i)])) {
                timeTogether += 5;
            }
        }
        return timeTogether;
    }

    //куда смотрит голова (какой элемент массива нам нужен) в данный момент времени
    private static int currElem(String[] array, int turnTime, int i) {
        return i % (turnTime * array.length) / turnTime;
    }
}
