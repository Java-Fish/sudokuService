package com.javaFish.structure;

import com.javaFish.util.CellService;
import com.javaFish.util.Game;
import com.javaFish.util.exceptions.SudokuCreationException;

import java.util.ArrayList;
import java.util.List;
import static com.javaFish.util.Constants.*;

public class Field {

    /**
     * Squares are numerated from 0-8 from top left to down right
     *  | 0 | 1 | 2 |
     *  | 3 | 4 | 5 |
     *  | 6 | 7 | 8 |
     */
    /**
     * Array of cells. First [] is column, second [] are rows
     */
    private Cell[][] cells = new Cell[MAX_NUMBER_OF_CELLS_IN_COLUMN][MAX_NUMBER_OF_CELLS_IN_ROW];

    public Field (Integer[] cellValues) throws SudokuCreationException {

        fillField(cellValues);
        
    }

    private void fillField(Integer[] cellValues) {

        for (int row = 0; row < MAX_NUMBER_OF_CELLS_IN_COLUMN; row++){
            for (int column = 0; column < MAX_NUMBER_OF_CELLS_IN_ROW; column++){
                int position = CellService.calcualtePosition(column,row);
                cells[column][row] = new Cell(position, cellValues[position]);
            }
        }
    }

    public Cell getCell(int column, int row){
        return cells[column][row];
    }
}
