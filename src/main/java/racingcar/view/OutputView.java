package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.List;

public class OutputView {

    public static void resultCar(List<RacingCar> racingCars) {
        racingCars.stream().forEach(car -> System.out.println(getResult(car)));
        System.out.println();
    }

    private static String getResult(RacingCar car) {

        String result = car.getName() + " : ";

        for(int i = 0; i < car.moveCnt(); i++) {
            result += "-";
        }

        return result;
    }

}
