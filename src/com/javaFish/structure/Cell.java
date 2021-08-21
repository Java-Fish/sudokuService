package com.javaFish.structure;

import java.util.ArrayList;
import java.util.List;

import static com.javaFish.util.Constants.*;

public class Cell implements NumberContainer {

    private final int position;
    private List<Integer> possibleValues = POSSIBLE_CELL_VALUES;
    private int value;

    public Cell(int position, int value){

        this.position = position;
        this.value = value;
        if (value != 0){
            List<Integer> newPossibleValues = new ArrayList<>();
            for (int pos = 0; pos < possibleValues.size(); pos++){
                if (possibleValues.get(pos)!=value){
                    newPossibleValues.add(possibleValues.get(pos));
                }
            }
            possibleValues = newPossibleValues;
        }
    }

    public int getValue(){
        return value;
    }

    /**
     * Center of the container
     * @return int from 0-80
     */
    @Override
    public int getPosition() {
        return position;
    }

    /**
     * a list from the number that could be possible to fill in
     *
     * @return
     */
    @Override
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public int getColumn() {
        return position/NINE;
    }

    public int getRow() {
        return position%NINE;
    }

}
