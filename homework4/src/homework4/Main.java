package homework4;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		Album album1 = new Album("Selam", "Selami", new Date(), List.of(new Song("Selamlar", "Selami", album1, 240)));

	}

}
