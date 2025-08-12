package dev.milca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysManagerTest {
    @Test 
    void testDaysManagerConstructorShouldCreateAnEmptyList() {
        DaysManager daysManager = new DaysManager();
        int listSize = daysManager.getListSize();
        Assertions.assertEquals(0, listSize);
    }
}
