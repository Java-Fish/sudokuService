package com.javaFish.structure;

import java.util.ArrayList;
import java.util.List;

import static com.javaFish.util.Constants.*;

public class Cell {

    private final Field fieldOfTheCell;
    private final int position;
    private List<Integer> possibleValues = POSSIBLE_CELL_VALUES;
    private int value;

    public Cell(int position, Integer value, Field field){

        this.fieldOfTheCell = field;
        this.position = position;
        this.value = value == null ? 0 : value;
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
    public int getPosition() {
        return position;
    }

    /**
     * a list from the number that could be possible to fill in
     *
     * @return
     */
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public int getColumn() {
        return position/NINE;
    }

    public int getRow() {
        return position%NINE;
    }

    public Field getFieldOfTheCell() {
        return fieldOfTheCell;
    }

    /**
     *
     * @param valueToRemove
     * @return true if the value was removed
     */
    public boolean removePossibleValue(Integer valueToRemove){
        if (possibleValues.size() == 0){
            return false;
        }

        List<Integer> newPossibleValues = new ArrayList<>();
        for (Integer oldPossibleValue : POSSIBLE_CELL_VALUES){
            if (oldPossibleValue != valueToRemove){
                newPossibleValues.add(oldPossibleValue);
            }
        }
        possibleValues = newPossibleValues;
        return true;
    }
}
