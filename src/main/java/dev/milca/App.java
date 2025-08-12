package dev.milca;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        DaysManager daysManager = new DaysManager();

        System.out.println("--- DEMOSTRACIÓN DE FUNCIONALIDADES ---");

        daysManager.createListOfDays();
        System.out.println("1. Lista inicial de días: " + daysManager.returnDays());
        
        System.out.println("2. Cantidad de días: " + daysManager.getListSize());
        
        System.out.println("3. Día en la posición 1 (índice 0): " + daysManager.getDayByIndex(0));
        
        System.out.println("4. ¿Existe 'Lunes'? " + daysManager.existsDay("Lunes"));
        System.out.println("5. ¿Existe 'Mábado'? " + daysManager.existsDay("Mábado"));
        
        daysManager.deleteDay("Lunes");
        System.out.println("6. Lista tras eliminar 'Lunes': " + daysManager.returnDays());
        
        daysManager.orderList();
        System.out.println("7. Lista ordenada alfabéticamente: " + daysManager.returnDays());
        
        daysManager.clearList();
        System.out.println("8. Lista después de vaciar: " + daysManager.returnDays());
    }
}
