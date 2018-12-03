import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by puke on 2018/11/21
 */
public class MapTest {
    @Test
    public void test(){
        try{
            throw new RuntimeException("hhhhh");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
