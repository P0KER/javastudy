import org.junit.Test;

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
