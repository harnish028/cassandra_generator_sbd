package generator;

import annotation.GenTramWorkerId;
import generator.interfaces.ITramWorkerIdGenerator;

import java.util.Random;

public class TramWorkerIdGenerator implements ITramWorkerIdGenerator<Integer> {

    @Override
    public Integer generate() {

        return getRandomNumberInRange(GenTramWorkerId.MIN_ID, GenTramWorkerId.MAX_ID);
    }

    @Override
    public Integer generate(int from, int to) {

        return getRandomNumberInRange(from, to);
    }

    private int getRandomNumberInRange(int min, int max) {

        Random r = new Random();

        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
}
