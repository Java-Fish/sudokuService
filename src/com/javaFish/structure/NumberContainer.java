package com.javaFish.structure;

import java.util.List;

public interface NumberContainer {

    /**
     * Center of the container
     * @return int from 0-80
     */
    public int getPosition();

    /**
     * a list from the number that could be possible to fill in
     * @return
     */
    public List<Integer> getPossibleValues();
}
