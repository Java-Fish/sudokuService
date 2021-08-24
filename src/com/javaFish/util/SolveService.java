package com.javaFish.util;

import com.javaFish.structure.Cell;

public class SolveService {

    private static CellService cellService = new CellService();
    private static SquareService squareService = new SquareService();

    public static boolean isValuePossible(Cell cell, int value){
        if (!cell.getPossibleValues().contains(value)){
            return false;
        }
        int column = cellService.getColumn(cell);
        int row = cellService.getRow(cell);

        return true;
    }
}
