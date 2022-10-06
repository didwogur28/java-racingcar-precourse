package racingcar.domain;

public class Move {

    public boolean move(int randomnum) {
        if(randomnum >= Code.MOVING_FORWARD && randomnum <= Code.END) {
            return true;
        }
        return false;
    }
}
