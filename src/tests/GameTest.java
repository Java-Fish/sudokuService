package tests;

import com.javaFish.structure.Field;
import com.javaFish.util.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    public static final Integer[] INPUT_HARD_ZERO_FILLED = new Integer[]{0,3,0,0,0,0,0,0,0,0,0,0,1,9,5,0,0,0,0,0,8,0,0,0,0,6,0,8,0,0,0,6,0,0,0,0,4,0,0,8,0,0,0,0,1,0,0,0,0,2,0,0,0,0,0,6,0,0,0,0,2,8,0,0,0,0,4,1,9,0,0,5,0,0,0,0,0,0,0,7,0};
    public static final Integer[] SOLUTION_HARD = new Integer[]{5,3,4,6,7,8,9,1,2,6,7,2,1,9,5,3,4,8,1,9,8,3,4,2,5,6,7,8,5,9,7,6,1,4,2,3,4,2,6,8,5,3,7,9,1,7,1,3,9,2,4,8,5,6,9,6,1,5,3,7,2,8,4,2,8,7,4,1,9,6,3,5,3,4,5,2,8,6,1,7,9};

    @BeforeEach
    public void checkGivenVales(){
        assertEquals(81,INPUT_HARD_ZERO_FILLED.length);
        assertEquals(81,SOLUTION_HARD.length);
    }

    @Test
    public void test_generateField_int(){
        Field fieldToTest = Game.generateField(INPUT_HARD_ZERO_FILLED);
        assertEquals(0,fieldToTest.getCell(0,0).getValue());
    }
}
