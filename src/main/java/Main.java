import ru.netology.stats.org.example.HMmassiv.StatsService;

public class Main {
    public static void main(String args[]){
    StatsService service = new StatsService();
    int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    System.out.println(service.aboveAverage( sale ));
    }


}
