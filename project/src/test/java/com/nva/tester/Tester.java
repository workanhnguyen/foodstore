package com.nva.tester;

import com.nva.pojo.MyPower;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tester {
    @Test
    public void test1() {
        Assertions.assertEquals(MyPower.nhan(2, 3), 6);
    }
}
