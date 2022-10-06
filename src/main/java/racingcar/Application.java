package racingcar;

import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {

        String carNames = InputView.inputCarName();
        int turn = InputView.inputTurn();
    }
}
