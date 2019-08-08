package cn.ice.lab.utils;

import org.junit.Test;

public class TestUtilityTools {

    @Test
    public void testGenerateUUID(){
        String id = UtilityTools.generateUUID();
        assert id != null;
        System.out.printf("[ID] %s %d", id, id.length());
    }
}
