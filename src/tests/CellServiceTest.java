package tests;

import com.javaFish.structure.Cell;
import com.javaFish.util.CellService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    private static final Cell CELL_0 = new Cell(0,1);
    private static final Cell CELL_28 = new Cell(28, 4);
    private static final Cell CELL_61 = new Cell(61, 0);
    private CellService service = new CellService();

    @Test
    public void test_getColumn(){
        assertEquals(0,service.getColumn(CELL_0));
        assertEquals(1,service.getColumn(CELL_28));
        assertEquals(7,service.getColumn(CELL_61));
    }

    @Test
    public void test_getRow(){
        assertEquals(0,service.getRow(CELL_0));
        assertEquals(3,service.getRow(CELL_28));
        assertEquals(6,service.getRow(CELL_61));
    }

    @Test
    public void test_calculatePosition(){
        assertEquals(0,CellService.calcualtePosition(0,0));
        assertEquals(28,CellService.calcualtePosition(1,3));
        assertEquals(61,CellService.calcualtePosition(7,6));
    }

    @Test
    public void test_getPossibleValues(){
        // value 1
        assertEquals(8,service.getPossibleNumbers(CELL_0).size());
        assertFalse(service.getPossibleNumbers(CELL_0).contains(1));
        for (int testValue = 2; testValue < 10; testValue++){
            assertTrue(service.getPossibleNumbers(CELL_0).contains(testValue));
        }
        // no value, value 0
        assertEquals(9,service.getPossibleNumbers(CELL_61).size());
        for (int testValue = 1; testValue < 10; testValue++){
            assertTrue(service.getPossibleNumbers(CELL_61).contains(testValue));
        }
    }
}
