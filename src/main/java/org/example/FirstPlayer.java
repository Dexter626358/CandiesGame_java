package org.example;

import java.util.Random;

public class FirstPlayer {
    private boolean flag;
    public boolean firstPlayer() {
        Random rnd = new Random();
        int way = rnd.nextInt(0, 2);
        if (way == 0) {
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
