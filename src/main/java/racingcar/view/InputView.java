package racingcar.view;

import racingcar.domain.Code;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarName() {

        System.out.print(Code.INPUT_NAME_MSG);
        String carNames = scanner.nextLine();

        return carNames;
    }

    public static int inputTurn() {

        System.out.print(Code.INPUT_TURN_MSG);
        String turn = scanner.nextLine();

        return Integer.parseInt(turn);
    }
}
