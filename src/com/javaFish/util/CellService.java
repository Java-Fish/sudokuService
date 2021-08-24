package com.javaFish.util;

import com.javaFish.structure.Cell;

import java.util.List;

import static com.javaFish.util.Constants.NINE;

public class CellService implements OneToNine {
    /**
     * @return List of possible int numbers
     * @param cell
     */
    @Override
    public List<Integer> getPossibleNumbers(Cell cell) {
        return cell.getPossibleValues();
    }

    /**
     * @param cell to check
     * @return true if number is possible, no check if it is the right number
     */
    @Override
    public boolean isNumberPossible(Cell cell) {
        return false;
    }

    @Override
    public int getColumn(Cell cell) {

        return getColumn(cell.getPosition());
    }

    public int getColumn (int position){
        return position%NINE;
    }

    @Override
    public int getRow(Cell cell) {

        return getRow(cell.getPosition());
    }

    public int getRow (int position){
        return position/NINE;
    }

    public static int calculatePosition(int column, int row){
        return (row*NINE)+column;
    }

}
