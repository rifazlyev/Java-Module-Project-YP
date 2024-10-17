import java.util.ArrayList;

public class Race {
    private String winner = "";
    private int maxDistance = 0;

    public void calculateWinner(ArrayList<Vehicle> listOfVehicle) {
        for (Vehicle vehicle : listOfVehicle) {
            int distance = vehicle.speed * 24; //Расчет дистанции, пройденной за 24 часа
            if (distance > maxDistance) {
                winner = vehicle.name; // Новый победитель
                maxDistance = distance; // Обновляем максимальную дистанцию
            } else if (distance == maxDistance) {
                // Если автомобили прошли одинаковое расстояние, добавляем их имена
                winner += " и " + vehicle.name;
            }
        }
    }

    public void printWinner() {
        if (winner.contains(" и ")) {
            System.out.println("Победители гонки: " + winner);
        } else {
            System.out.println("Победитель гонки: " + winner);
        }
    }
}
