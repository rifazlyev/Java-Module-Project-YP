import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition = 3; //Завел переменную если вдруг надо будет ввести больше 3 авто в будущем
        String vehicleName;
        int vehicleSpeed;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> listOfVehicle = new ArrayList<>();
        System.out.println("Приветствуем вас на соревнованиях!");
        System.out.println("В гонке участвует " + condition + " автомобиля");

        for (int i = 1; i <= condition; i++) {
            System.out.println("- Введите название машины №" + i + ":");
            vehicleName = scanner.next();

            while (true) {
                System.out.println("- Введите скорость машины №" + i + ":");
                // Проверяем, что введенное значение это целое число
                if (scanner.hasNextInt()) {
                    vehicleSpeed = scanner.nextInt();

                    // Проверяем, что скорость в пределах от 0 до 250
                    if (vehicleSpeed >= 0 && vehicleSpeed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 0 до 250.");
                    }
                } else {
                    System.out.println("Ошибка: введите целое число от 0 до 250.");
                    scanner.next();
                }
            }
            listOfVehicle.add(new Vehicle(vehicleName, vehicleSpeed));
        }
        Race race = new Race();
        race.calculateWinner(listOfVehicle);
        race.printWinner();
    }
}
