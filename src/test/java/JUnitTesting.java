/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.me.mylib.LibClass;
/**
 *
 * @author andy2
 */
public class JUnitTesting {
    @Test
    void testMethod(){
        String result = LibClass.acrostic(new String[] {"fnord", "polly", "tropism"});
        assertEquals("Correct Value", "foo", result);
    }
}
