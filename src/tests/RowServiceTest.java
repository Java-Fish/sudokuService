package tests;

import com.javaFish.structure.Cell;
import com.javaFish.util.RowService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static tests.TestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class RowServiceTest {

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

    private RowService rowService = new RowService();

        @Test
        public void test_getPossibleNumbers(){
            Cell testCell = TEST_FIELD_HARD.getCell(30);
            assertEquals(9, testCell.getPossibleValues().size());
            assertEquals(0, testCell.getValue());
            List<Integer> outputList = rowService.getPossibleNumbers(testCell);

            assertEquals(5,testCell.getPossibleValues().size());
            assertTrue(outputList==testCell.getPossibleValues());

            for (Integer i = 1; i < 10; i++) {
                if (i == 1 || i == 4 || i == 6 || i == 8) {
                    assertFalse(outputList.contains(i));
                    assertFalse(testCell.getPossibleValues().contains(i));
                    continue;
                }
                assertTrue(outputList.contains(i));
                assertTrue(testCell.getPossibleValues().contains(i));
            }
        }
}
