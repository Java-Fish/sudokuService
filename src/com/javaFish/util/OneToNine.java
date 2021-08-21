package com.javaFish.util;

import com.javaFish.structure.Cell;
import com.javaFish.structure.NumberContainer;

import java.util.List;

public interface OneToNine {

    /**
     *
     * @return List of possible int numbers
     */
    public List<Integer> getPossibleNumbers(NumberContainer container);

    /**
     *
     * @param container to check
     * @return true if number is possible, no check if it is the right number
     */
    public boolean isNumberPossible(NumberContainer container);

    public int getColumn (NumberContainer center);

    public int getRow (NumberContainer center);
}
