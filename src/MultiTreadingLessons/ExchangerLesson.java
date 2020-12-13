package MultiTreadingLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerLesson {
    // Exchanger - это синхронизатор, позволяющий обмениваться данными между двумя потоками,
    // обеспечивает то, что оба потока получат информацию друг от друга одновременно

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJHICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJHICI);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJHICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
            if ((myAction == Action.KAMEN && friendsAction == Action.NOJHICI)
            || (myAction == Action.NOJHICI && friendsAction == Action.BUMAGA)
            || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " wins!!!");
        }else
            {
                System.out.println(name + " lose");
            }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action :myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
