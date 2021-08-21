package com.javaFish.util;

import com.javaFish.structure.NumberContainer;

import java.util.List;

import static com.javaFish.util.Constants.NINE;

public class CellService implements OneToNine {
    /**
     * @return List of possible int numbers
     */
    @Override
    public List<Integer> getPossibleNumbers(NumberContainer container) {
        return container.getPossibleValues();
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
        return center.getPosition()%NINE;
    }

    @Override
    public int getRow(NumberContainer center) {
        return center.getPosition()/NINE;
    }

    public static int calcualtePosition(int column, int row){
        return (row*NINE)+column;
    }

}
