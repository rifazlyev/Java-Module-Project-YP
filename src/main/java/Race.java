import java.util.ArrayList;

public class Race {
    String winner = "";
    int maxDistance = 0;

    public void calculateWinner(ArrayList<Vehicle> listOfVehicle) {
        for (Vehicle vehicle : listOfVehicle) {
            int distance = vehicle.speed * 24;
            if (distance > maxDistance) {
                winner = vehicle.name;
                maxDistance = distance;
            }
            //На случай если будут одинаковые значения скорости
            else if (distance == maxDistance) {
                winner += " и " + vehicle.name;
                maxDistance = distance;
            }
        }
    }

    //Выводим в консоль имя победителя
    public void printWinner() {
        System.out.println("Самая быстрая машина: " + winner);
    }
}
