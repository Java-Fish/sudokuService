package tests;

import com.javaFish.structure.Field;
import com.javaFish.util.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tests.TestConstants.*;

public class GameTest {

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
