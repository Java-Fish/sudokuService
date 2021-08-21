package com.javaFish.structure;

import java.util.List;

public class Square implements NumberContainer{
    /**
     * Center of the container
     *
     * @return int from 0-80
     */
    @Override
    public int getPosition() {
        return 0;
    }

    /**
     * a list from the number that could be possible to fill in
     *
     * @return
     */
    @Override
    public List<Integer> getPossibleValues() {
        return null;
    }
}
