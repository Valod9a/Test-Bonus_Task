package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BonusServiceTest {

    private BonusService service;

    static final double sales = 12000;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    @DisplayName("Test Calc Bonus Right")
    void Test_CalcBonus_Right(){
        assertEquals(sales * 0.1, service.calcBonus(sales));
    }

    @Test
    @DisplayName("Test Calc Bonus Wrong")
    void Test_CalcBonus_Wrong(){
        assertNotEquals(sales * 0.2, service.calcBonus(sales));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}