package com.javaFish.util;

import com.javaFish.structure.NumberContainer;

import java.util.List;

public class SquareService implements OneToNine{
    /**
     * @param container
     * @return List of possible int numbers
     */
    @Override
    public List<Integer> getPossibleNumbers(NumberContainer container) {
        return null;
    }

    /**
     * @param container to check
     * @return true if number is possible, no check if it is the right number
     */
    @Override
    public boolean isNumberPossible(NumberContainer container) {
        return false;
    }

    @Override
    public int getColumn(NumberContainer center) {
        return 0;
    }

    @Override
    public int getRow(NumberContainer center) {
        return 0;
    }
}
