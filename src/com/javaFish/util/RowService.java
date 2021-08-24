package com.javaFish.util;

import com.javaFish.structure.Cell;
import com.javaFish.structure.Field;

import java.util.*;

import static com.javaFish.util.Constants.*;

public class RowService implements OneToNine{

    private static CellService cellService = new CellService();

    /**
     * @param cell
     * @return List of possible int numbers for horizontal and vertical row
     */
    @Override
    public List<Integer> getPossibleNumbers(Cell cell) {
        if (cell.getPossibleValues().size()==0){
            return new ArrayList<Integer>();
        }
        int positionCurrentCell = cell.getPosition();
        Field field = cell.getFieldOfTheCell();
        List<Integer> rows = getCellpositionsOfRow(cell);
        List<Integer> columns = getCellpositionsOfColumn(cell);

        //Get the values of all cells in row and column
        List<Integer> valuesInCells = new ArrayList<>();
        for (Integer cellPosition: rows){
            if (cellPosition==positionCurrentCell) continue;
            valuesInCells.add(field.getCell(cellPosition).getValue());
        }
        for (Integer cellPosition: columns){
            if (cellPosition==positionCurrentCell) continue;
            valuesInCells.add(field.getCell(cellPosition).getValue());
        }

        //remove all possible values from the current cell that are already filled in other cells
        for (Integer valueOfOtherCell: valuesInCells){
            if(cell.getPossibleValues().contains(valueOfOtherCell)){
                cell.removePossibleValue(valueOfOtherCell);
                if (cell.getPossibleValues().size()==0){
                    return new ArrayList<Integer>();
                }
            }
        }
        
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
        return 0;
    }

    @Override
    public int getRow(Cell cell) {
        return 0;
    }

    public static List<Integer> getCellpositionsOfRow(Cell cell){
        int row = cellService.getRow(cell);
        switch (row){
            case 0 : return CELL_POSITIONS_ROW_0;
            case 1 : return CELL_POSITIONS_ROW_1;
            case 2 : return CELL_POSITIONS_ROW_2;
            case 3 : return CELL_POSITIONS_ROW_3;
            case 4 : return CELL_POSITIONS_ROW_4;
            case 5 : return CELL_POSITIONS_ROW_5;
            case 6 : return CELL_POSITIONS_ROW_6;
            case 7 : return CELL_POSITIONS_ROW_7;
            case 8 : return CELL_POSITIONS_ROW_8;
            default : return null;
        }
    }

    public static List<Integer> getCellpositionsOfColumn(Cell cell){
        int column = cellService.getColumn(cell);
            switch (column){
                case 0 : return CELL_POSITIONS_COLUMN_0;
                case 1 : return CELL_POSITIONS_COLUMN_1;
                case 2 : return CELL_POSITIONS_COLUMN_2;
                case 3 : return CELL_POSITIONS_COLUMN_3;
                case 4 : return CELL_POSITIONS_COLUMN_4;
                case 5 : return CELL_POSITIONS_COLUMN_5;
                case 6 : return CELL_POSITIONS_COLUMN_6;
                case 7 : return CELL_POSITIONS_COLUMN_7;
                case 8 : return CELL_POSITIONS_COLUMN_8;
                default : return null;
            }
    }
}
