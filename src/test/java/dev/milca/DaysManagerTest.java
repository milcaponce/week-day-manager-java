package dev.milca;
import java.util.List;

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

    @Test
    void testReturnDaysShouldReturnCorrectList() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        List<String> returnedDays = daysManager.returnDays();
        Assertions.assertNotNull(returnedDays);
        Assertions.assertEquals(7, returnedDays.size());
    }

    @Test
    void testGetListSizeShouldReturnCorrectSizeAfterCreatingList(){
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        int listSize = daysManager.getListSize();
        Assertions.assertEquals(7, listSize);
    }
}


/*Teoría para el test:
 * Arrange: crear instancia de la clase (DaysManager daysManager = new DaysManager();)
 * Act: llamar al método que se quiere probar (daysManager.nombreDelMetodo();) En ocasiones, colocar a (tipo de dato + nombre =)
 * Assert: Verificar el resultado, se llama al método y se utiliza Assertions.assert...(); para comparar el resultado con el valor esperado
 */
