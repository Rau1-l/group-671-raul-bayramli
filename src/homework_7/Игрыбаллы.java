package homework_7;

public class Игрыбаллы {
	public static void main(String[] args) {
        int[] баллы = {120, 85, 200, 95, 150, 60, 175, 110};

        int bestСчёт = баллы[0];
        int theworstСчёт = баллы[0];

        for(int i = 1; i < баллы.length; i++) {
            bestСчёт = Math.max(bestСчёт, баллы[i]);
            theworstСчёт = Math.min(theworstСчёт, баллы[i]);
        }

        System.out.println("Лучший результат: " + bestСчёт);
        System.out.println("Худший результат: " + theworstСчёт);

        int разница = bestСчёт - theworstСчёт;
        System.out.println("Разница между лучшим и худшим: " + разница + " баллов");

        if(разница > 100) {
            System.out.println("Очень большая разница!");
        }
    }
}