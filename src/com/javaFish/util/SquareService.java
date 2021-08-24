package com.javaFish.util;

import com.javaFish.structure.Cell;

import java.util.List;

/**
 * Structure of squares in the field
 *  | 0 | 1 | 2 |
 *  | 3 | 4 | 5 |
 *  | 6 | 7 | 8 |
 */
public class SquareService implements OneToNine{

    private static CellService cellService = new CellService();
    /**
     * @param cell
     * @return List of possible int numbers
     */
    @Override
    public List<Integer> getPossibleNumbers(Cell cell) {
        return null;
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
        return cellService.getColumn(cell)%3;
    }

    @Override
    public int getRow(Cell cell) {
        return cellService.getRow(cell)/3;
    }

    /**
     * @param cell               cell where the possible values have to be removed
     * @param valuesOfOtherCells values from other cells either from a row/column or a cell
     * @return the corrected possible values for the transmitted cell
     */
    @Override
    public List<Integer> removePossibleValuesFromCell(Cell cell, List<Integer> valuesOfOtherCells) {
        return null;
    }

    public int getSquarePosition(Cell cell){
       return 0;
    }
}
