package com.javaFish.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final int NINE = 9;
    public static final int MAX_NUMBER_OF_CELLS = 81;
    public static final int MAX_NUMBER_OF_SQUARES = NINE;
    public static final int MAX_NUMBER_OF_CELLS_IN_SQUARE = NINE;
    public static final int MAX_NUMBER_OF_CELLS_IN_COLUMN = NINE;
    public static final int MAX_NUMBER_OF_CELLS_IN_ROW = NINE;
    public static final int MAX_CELL_VALUE = NINE;
    public static final int MIN_CELL_VALUE = 1;
    public static final List<Integer> POSSIBLE_CELL_VALUES = Arrays.asList(1,2,3,4,5,6,7,8,9);
    /**
     * Cellsnumbers
     * 0	1	2	|   3	4	5	|   6	7	8
     * 9	10	11	|   12	13	14	|   15	16	17
     * 18	19	20	|   21	22	23	|   24	25	26
     * -------------------------------------------
     * 27	28	29	|   30	31	32	|   33	34	35
     * 36	37	38	|   39	40	41	|   42	43	44
     * 45	46	47	|   48	49	50	|   51	52	53
     * -------------------------------------------
     * 54	55	56	|   57	58	59	|   60	61	62
     * 63	64	65	|   66	67	68	|   69	70	71
     * 72	73	74	|   75	76	77	|   78	79	80
     */
    //Squares
    public static final int[] CELL_POSITIONS_SQUARE_0 = new int[]{0,1,2,9,10,11,18,19,20};
    public static final int[] CELL_POSITIONS_SQUARE_1 = new int[]{3,4,5,12,13,14,21,22,23};
    public static final int[] CELL_POSITIONS_SQUARE_2 = new int[]{6,7,8,15,16,17,24,25,26};
    public static final int[] CELL_POSITIONS_SQUARE_3 = new int[]{27,28,29,36,37,38,45,46,47};
    public static final int[] CELL_POSITIONS_SQUARE_4 = new int[]{30,31,32,39,40,41,48,49,50};
    public static final int[] CELL_POSITIONS_SQUARE_5 = new int[]{33,34,35,42,43,44,51,52,53};
    public static final int[] CELL_POSITIONS_SQUARE_6 = new int[]{54,55,56,63,64,65,72,73,74};
    public static final int[] CELL_POSITIONS_SQUARE_7 = new int[]{57,58,59,66,67,68,75,76,77};
    public static final int[] CELL_POSITIONS_SQUARE_8 = new int[]{60,61,62,69,70,71,78,79,80};
    //Rows
    public static final int[]  CELL_POSITIONS_ROW_0 = new int[]{0,1,2,3,4,5,6,7,8};
    public static final int[]  CELL_POSITIONS_ROW_1 = new int[]{9,10,11,12,13,14,15,16,17};
    public static final int[]  CELL_POSITIONS_ROW_2 = new int[]{18,19,20,21,22,23,24,25,26};
    public static final int[]  CELL_POSITIONS_ROW_3 = new int[]{27,28,29,30,31,32,33,34,35};
    public static final int[]  CELL_POSITIONS_ROW_4 = new int[]{36,37,38,39,40,41,42,43,44};
    public static final int[]  CELL_POSITIONS_ROW_5 = new int[]{45,46,47,48,49,50,51,52,53};
    public static final int[]  CELL_POSITIONS_ROW_6 = new int[]{54,55,56,57,58,59,60,61,62};
    public static final int[]  CELL_POSITIONS_ROW_7 = new int[]{63,64,65,66,67,68,69,70,71};
    public static final int[]  CELL_POSITIONS_ROW_8 = new int[]{72,73,74,75,76,77,78,79,80};
    //Column
    public static final int[]  CELL_POSITIONS_COLUMN_0 = new int[]{0,9,18,27,36,45,54,63,72};
    public static final int[]  CELL_POSITIONS_COLUMN_1 = new int[]{1,10,19,28,37,46,55,64,73};
    public static final int[]  CELL_POSITIONS_COLUMN_2 = new int[]{2,11,20,29,38,47,56,65,74};
    public static final int[]  CELL_POSITIONS_COLUMN_3 = new int[]{3,12,21,30,39,48,57,66,75};
    public static final int[]  CELL_POSITIONS_COLUMN_4 = new int[]{4,13,22,31,40,49,58,67,76};
    public static final int[]  CELL_POSITIONS_COLUMN_5 = new int[]{5,14,23,32,41,50,59,68,77};
    public static final int[]  CELL_POSITIONS_COLUMN_6 = new int[]{6,15,24,33,42,51,60,69,78};
    public static final int[]  CELL_POSITIONS_COLUMN_7 = new int[]{7,16,25,34,43,52,61,70,79};
    public static final int[]  CELL_POSITIONS_COLUMN_8 = new int[]{8,17,26,35,44,53,62,71,80};
    //Field
    public static final List<int[]> CELLS_ASSIGNED_TO_SQUARES = Arrays.asList(
            CELL_POSITIONS_SQUARE_0,
            CELL_POSITIONS_SQUARE_1,
            CELL_POSITIONS_SQUARE_2,
            CELL_POSITIONS_SQUARE_3,
            CELL_POSITIONS_SQUARE_4,
            CELL_POSITIONS_SQUARE_5,
            CELL_POSITIONS_SQUARE_6,
            CELL_POSITIONS_SQUARE_7,
            CELL_POSITIONS_SQUARE_8
    );
}
