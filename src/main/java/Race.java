public class Race {
    private String winner = "";
    private int maxDistance = 0;

    public void calculateWinner(Vehicle vehicle) {
        int distance = vehicle.speed * 24; //Расчет дистанции, пройденной за 24 часа
        // Использую >= для того, чтобы перезаписывался последний победитель
        if (distance >= maxDistance) {
            winner = vehicle.name; // Новый победитель
            maxDistance = distance; // Обновляем максимальную дистанцию
        }
    }

    public void printWinner() {
        System.out.println("Победитель гонки: " + winner);
    }
}
