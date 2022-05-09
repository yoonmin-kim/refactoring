package me.whiteship.refactoring._12_repeated_swtiches;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SwitchImprovementsTest {

    SwitchImprovements si = null;

    @BeforeEach
    void beforeEach() {
        si = new SwitchImprovements();
    }

    @Test
    @DisplayName("break 문이 없어서 버그가 발생하는 케이스")
    void vacationHours() {
        assertNotEquals(120, si.vacationHours("full-time"));
    }

    @Test
    void vacationHours2() {
        assertEquals(120, si.vacationHours2("full-time"));
    }

    @Test
    void vacationHours3() {
        assertEquals(120, si.vacationHours3("full-time"));
    }

}