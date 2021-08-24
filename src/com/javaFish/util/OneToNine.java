package com.javaFish.util;

import com.javaFish.structure.Cell;

import java.util.List;

public interface OneToNine {

    /**
     *
     * @return List of possible int numbers
     * @param cell
     */
    public List<Integer> getPossibleNumbers(Cell cell);

    /**
     *
     * @param cell to check
     * @return true if number is possible, no check if it is the right number
     */
    public boolean isNumberPossible(Cell cell);

    public int getColumn (Cell cell);

    public int getRow (Cell cell);

    /**
     *
     * @param cell
     *  cell where the possible values have to be removed
     * @param valuesOfOtherCells
     *  values from other cells either from a row/column or a cell
     * @return the corrected possible values for the transmitted cell
     */
    public  List<Integer> removePossibleValuesFromCell(Cell cell, List<Integer> valuesOfOtherCells);
}
