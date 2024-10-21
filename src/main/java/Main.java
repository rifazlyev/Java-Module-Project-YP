import java.util.Scanner;

public class Main {
    private final static int MAX_CAR_IN_RACE = 3; //Завел переменную если вдруг надо будет ввести больше 3 авто в будущем

    public static void main(String[] args) {
        String vehicleName;
        int vehicleSpeed;
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        System.out.println("Приветствуем вас на соревнованиях!");
        System.out.println("В гонке участвует " + MAX_CAR_IN_RACE + " автомобиля");

        for (int i = 1; i <= MAX_CAR_IN_RACE; i++) {
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
            race.calculateWinner(new Vehicle(vehicleName, vehicleSpeed));
        }
        race.printWinner();
        scanner.close();
    }
}
