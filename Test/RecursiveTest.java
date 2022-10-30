import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class RecursiveTest {
    @Test
    public void getSumMore(){
        ArrayList<Integer> numbs= new ArrayList<>(Arrays.asList( 5, 10, 15, 20,5 ));
        int sum = 0;
        int spot = numbs.size();
        sum = RecursiveHw.getSum( numbs, sum, spot-1 );
        System.out.printf("\nsum:%s", sum);
        assertEquals(55,55);
    }
    @Test
    public void getSumLess(){
        ArrayList<Integer> numbs= new ArrayList<>(Arrays.asList( 5, 10 ));
        int sum = 0;
        int spot = numbs.size();
        sum = RecursiveHw.getSum( numbs, sum, spot-1 );
        System.out.printf("\nsum:%s", sum);
        assertEquals(15,15);
    }
    @Test
    public void getSumNone() {
        ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(0, 0));
        int sum = 0;
        int spot = numbs.size();
        sum = RecursiveHw.getSum(numbs, sum, spot - 1);
        System.out.printf("\nsum:%s", sum);
        assertEquals(0, 0);
    }
    @Test
    public void getHowManyp() {
        System.out.print("\n ---------------");
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 'p';
        int loc = inString.length()-1;
        int sum2 = 0;
        int ct = RecursiveHw.getHowMany( inString, tok, sum2, loc);
        System.out.printf("getHowMany ct:%s", ct);
        assertEquals(5, 5);
    }
    @Test
    public void getHowManyChangeTokE() {
        System.out.print("\n ---------------");
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 'e';
        int loc = inString.length()-1;
        int sum2 = 0;
        int ct = RecursiveHw.getHowMany( inString, tok, sum2, loc);
        System.out.printf("getHowMany ct:%s", ct);
        assertEquals(4, 4);
    }
    @Test
    public void getHowManyChangeTokJ() {
        System.out.print("\n ---------------");
        String inString = "Purple Apples str pretty Pleasing p";
        char tok = 'j';
        int loc = inString.length()-1;
        int sum2 = 0;
        int ct = RecursiveHw.getHowMany( inString, tok, sum2, loc);
        System.out.printf("getHowMany ct:%s", ct);
        assertEquals(0, 0);
    }

}
