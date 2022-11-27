package ut.com.sven.angularinjira;

import org.junit.Test;
import com.sven.angularinjira.api.MyPluginComponent;
import com.sven.angularinjira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}