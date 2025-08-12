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

    @Test
    void testCreateListOfDaysShouldAddSevenDaysToTheList() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        Assertions.assertEquals(7, daysManager.getListSize());
    }
}


/*Teoría para el test:
 * Arrange: crear instancia de la clase para que el estado inicial del objeto sea el esperado. (DaysManager daysManager = new DaysManager();)
 * Act: llamar al método que se quiere probar (daysManager.createListOfDays();)
 * Assert: Verificar el resultado, se llama al método y se utiliza Assertions.assertEquals... para comparar el resultado con el valor esperado
 */
