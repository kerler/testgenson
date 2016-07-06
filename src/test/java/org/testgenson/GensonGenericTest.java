package org.testgenson;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.reflect.VisibilityFilter;
import org.junit.Test;
import org.openehr.rm.datatypes.quantity.datetime.DvDateTime;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liubaogang on 2016/4/18.
 */
public class GensonGenericTest {

    @Test
    public void should_find_addresses() throws Exception {
        Genson genson = new GensonBuilder()
                .useIndentation(true)
                .useRuntimeType(true)
                .useClassMetadata(true)
                .useFields(true, VisibilityFilter.PRIVATE)
//                .useMethods(false)
                .create();

        DvDateTime dvDateTime = new DvDateTime("2016-07-06T20:47:43.316+08:00");
        String strDvDateTime = genson.serialize(dvDateTime);
        assertNotNull(strDvDateTime);
    }
}
