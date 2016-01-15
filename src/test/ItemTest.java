package test;

import pos.Item;

import static org.junit.Assert.*;

public class ItemTest {
    Item item,item1,item2;
    @org.junit.Before
    public void setUp() throws Exception {
//        普通
        item =new Item("ITEM000000","可口可乐","瓶" ,  3.00 ,0.80 , false,false,  1.00);
        item.addItemNum();
        //   买二赠一
        item1 =new Item("ITEM000000","可口可乐","瓶" ,  3.00 ,0.80 , true,false,  1.00);
        item1.addItemNum();
        item1.addItemNum();
        item1.addItemNum();
        //   会员
        item2 =new Item("ITEM000000","可口可乐","瓶" ,  3.00 ,0.80 , true,true,  0.80);
        item2.addItemNum();
    }
    /*
    * 测试计算总价
    * */
    @org.junit.Test
    public void testGetTotal() throws Exception {
        Double result=3.00*0.8*2.0;
        assertEquals(result, item.getTotal());
        Double result1=3.00*3.0;
        assertEquals(result1, item1.getTotal());
        Double result2=3.00*0.8*2.0*0.8;
        assertEquals(result2, item2.getTotal());
    }
    /*
    * 测试计算节省
    * */
    @org.junit.Test
    public void testGetSave() throws Exception {
        Double result=3.0*2.0-3.00*0.8*2.0;
        assertEquals(result, item.getSave());
        Double result1=3.00;
        assertEquals(result1, item1.getSave());
        Double result2=3.0*2.0-3.00*0.8*2.0*0.8;
        assertEquals(result2, item2.getSave());
    }
}