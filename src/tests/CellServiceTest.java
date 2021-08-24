package tests;

import com.javaFish.structure.Cell;
import com.javaFish.util.CellService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tests.TestConstants.TEST_FIELD_HARD;

public class CellServiceTest {

    /**
     * Fieldpositions
     *
     * 0	1	2	3	4	5	6	7	8
     * 9	10	11	12	13	14	15	16	17
     * 18	19	20	21	22	23	24	25	26
     * 27	28	29	30	31	32	33	34	35
     * 36	37	38	39	40	41	42	43	44
     * 45	46	47	48	49	50	51	52	53
     * 54	55	56	57	58	59	60	61	62
     * 63	64	65	66	67	68	69	70	71
     * 72	73	74	75	76	77	78	79	80
     */

    private static final Cell CELL_0 = TEST_FIELD_HARD.getCell(0);
    private static final Cell CELL_39 = TEST_FIELD_HARD.getCell(39);
    private static final Cell CELL_66 = TEST_FIELD_HARD.getCell(66);;
    private CellService service = new CellService();

    @Test
    public void test_getColumn(){
        assertEquals(0,service.getColumn(CELL_0));
        assertEquals(3,service.getColumn(CELL_39));
        assertEquals(3,service.getColumn(CELL_66));
    }

    @Test
    public void test_getRow(){
        assertEquals(0,service.getRow(CELL_0));
        assertEquals(4,service.getRow(CELL_39));
        assertEquals(7,service.getRow(CELL_66));
    }

    @Test
    public void test_calculatePosition(){
        assertEquals(0,CellService.calculatePosition(0,0));
        assertEquals(28,CellService.calculatePosition(1,3));
        assertEquals(61,CellService.calculatePosition(7,6));
    }

    @Test
    public void test_getPossibleValues(){
        // value 0
        assertEquals(9,service.getPossibleNumbers(CELL_0).size());
        assertTrue(service.getPossibleNumbers(CELL_0).contains(1));
        for (int testValue = 1; testValue < 10; testValue++){
            assertTrue(service.getPossibleNumbers(CELL_0).contains(testValue));
        }
        // value 8
        assertEquals(8,service.getPossibleNumbers(CELL_39).size());
        for (int testValue = 1; testValue < 10; testValue++){
            if (8 == testValue) continue;
            assertTrue(service.getPossibleNumbers(CELL_39).contains(testValue));
        }
    }
}
