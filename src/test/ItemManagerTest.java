package test;

import org.junit.Before;
import org.junit.Test;
import pos.ItemManager;

import static org.junit.Assert.assertEquals;

/**
 * Created by hanchao on 2016/1/14.
 */
public class ItemManagerTest {
    ItemManager items,items1,items2;
    @Before
    public void setUp() throws Exception {
         items =new ItemManager("index.txt","users.txt");
        items.fileInput("./src/test/Item1.txt");
        items1 =new ItemManager("index.txt","users.txt");
        items1.fileInput("./src/test/Item2.txt");
        items2 =new ItemManager("index.txt","users.txt");
        items2.fileInput("./src/test/Item3.txt");
    }

    @Test
    public void testTotal() throws Exception {
        //会员
        Double result=3.00*0.8*4.0*0.8;
        assertEquals(result,items.total());
        //非会员,非买二赠一
        Double result1=3.00*0.8*4.0;
        assertEquals(result1,items1.total());
        //非会员,买二赠一
        Double result3=3.00*3.0;
        assertEquals(result3,items2.total());
    }

    @Test
    public void testSave() throws Exception {
        //会员
        Double result=3.0*4.0-3.00*0.8*4.0*0.8;
        assertEquals(result,items.save());
        //非会员,非买二赠一
        Double result1=3.0*4.0-3.00*0.8*4.0;
        assertEquals(result1,items1.save());
        //非会员,买二赠一
        Double result3=3.00;
        assertEquals(result3,items2.save());
    }

}