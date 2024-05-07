package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testBoundaryAmount999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
