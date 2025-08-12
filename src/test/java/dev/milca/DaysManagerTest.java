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

    @Test
    void testDeleteDayShouldRemoveTheDayAndReturnTrue() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        boolean result = daysManager.deleteDay("Lunes");
        Assertions.assertTrue(result, "El método debe devolver true al eliminar un día existente");
        Assertions.assertFalse(daysManager.existsDay("Lunes"), "Lunes no debería existir en la lista");
        Assertions.assertEquals(6,daysManager.getListSize(), "El tamaño de la lista debería ser 6");
    }

    @Test
    void testDeleteDayShouldReturnFalseIfDayDoesnNotExist() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        boolean result = daysManager.deleteDay("Lumingo");
        Assertions.assertFalse(result, "El método debe devolver false si el día no existe");
        Assertions.assertEquals(7, daysManager.getListSize(), "El tamaño de la lista no debe cambiar si el día no existe" );
    }

    @Test
    void testGetDayByIndexShouldReturnCorrectDay() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        String day = daysManager.getDayByIndex(0);
        Assertions.assertEquals("Lunes", day, "El día 0 debería ser Lunes");
    }

    @Test
    void testExistsDayShouldReturnTrueIfDayExists() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        boolean result = daysManager.existsDay("Miércoles");
        Assertions.assertTrue(result, "El método debe devolver true si el día Miércoles existe");
    }

    @Test
    void testExistsDayShouldReturnFalseIfDayDoesNotExist() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        boolean result = daysManager.existsDay("Mábado");
        Assertions.assertFalse(result, "El método debe devolver false si el día Mábado no existe.");
    }

    @Test
    void testOrderListShouldSortDaysAlphabetically() {
        DaysManager daysManager = new DaysManager();
        daysManager.createListOfDays();
        daysManager.orderList();
        List<String> orderedList = daysManager.returnDays();
        Assertions.assertEquals("Domingo", orderedList.get(0), "El primer día de la lista ordenada deber ser Domingo.");
        Assertions.assertEquals("Jueves", orderedList.get(1), "El segundo día de la lista ordenada debe ser Jueves.");
    }
}


/*Teoría para el test:
 * Arrange: crear instancia de la clase (DaysManager daysManager = new DaysManager();)
 * Act: llamar al método que se quiere probar (daysManager.nombreDelMetodo();) En ocasiones, colocar a (tipo de dato + nombre =)
 * Assert: Verificar el resultado, se llama al método y se utiliza Assertions.assert...(); para comparar el resultado con el valor esperado
 */
