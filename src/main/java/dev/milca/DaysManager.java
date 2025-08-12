package dev.milca;

import java.util.ArrayList;
import java.util.List;
//Clase
public class DaysManager {
    private List<String> daysOfWeek;

//Constructor
    public DaysManager() {
        this.daysOfWeek = new ArrayList<>();
    }

//Métodos
    public void createListOfDays() {
    this.daysOfWeek.add("Lunes");
    this.daysOfWeek.add("Martes");
    this.daysOfWeek.add("Miércoles");
    this.daysOfWeek.add("Jueves");
    this.daysOfWeek.add("Viernes");
    this.daysOfWeek.add("Sábado");
    this.daysOfWeek.add("Domingo");
    }

    public List<String> returnDays() {
        return this.daysOfWeek;
    }

    public int getListSize() {
        return this.daysOfWeek.size();
    }

    public boolean deleteDay(String day) {
        return this.daysOfWeek.remove(day);
    }

    public String getDayByIndex(int index) {
        return this.daysOfWeek.get(index);
    }

    public boolean existsDay(String day) {
        return this.daysOfWeek.contains(day);
    }

    public void orderList() {

    }
    
    public void clearList() {
        this.daysOfWeek.clear();
    }
}


/*### Partes de un método:

- Modificador de acceso → `public`, `private`
- Tipo de retorno → `void`, `int`, `String`, etc.
- Nombre → verbo en camelCase (`imprimirNombre`)
- Parámetros → opcionales*/