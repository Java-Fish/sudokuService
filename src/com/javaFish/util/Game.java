package com.javaFish.util;

import com.javaFish.structure.Field;

import java.util.Random;

import static com.javaFish.util.Constants.*;

public class Game {

    public static Field generateField(String[] cells){

        Integer[] intCells = convertStringToIntegerArray(cells);
        return generateField(intCells);
    }

    public static Field generateField(Integer[] cells){
        if (!cellsValid(cells)) {
            return null;
        }

        return new Field(cells);
    }
    
    public static Field randomField(int difficulty){
        Random r = new Random();
        Integer[] values = new Integer[MAX_NUMBER_OF_CELLS];
        for (int position = 0; position < MAX_NUMBER_OF_CELLS; position++) {

            values[position] = r.nextInt((MAX_CELL_VALUE - (MIN_CELL_VALUE-1)) + 1) + MIN_CELL_VALUE;
        }
        return generateField(values);
    }

    private static Integer[] convertStringToIntegerArray(String[] cells){
        Integer[] intCellValues = new Integer[cells.length];
        for(int i = 0; i < cells.length; i++){
            intCellValues[i] = Integer.valueOf(cells[i]);
        }
        return intCellValues;
    }

    private static boolean cellsValid(Integer[] cells) {
        if (cells.length!=MAX_NUMBER_OF_CELLS){
            return false;
        }
        for (Integer cell: cells){
            //it is possible to set 0 or NULL as emtpy cell
            if (cell == null || cell == 0) continue;

            if (cell < MIN_CELL_VALUE || cell > MAX_CELL_VALUE){
                return false;
            }
        }
        return true;
    }
}
