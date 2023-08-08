package data;

import model.entity.Card;
import model.entity.User;

import java.util.Random;
import java.util.UUID;

public class GlobalData {
    public static final User [] users;
    public static final Card [] cards ;

    static {
        int id = 1;
        Random random = new Random();
        cards = new Card[]{
                new Card(id++, "4169738812345678",String.valueOf(random.nextInt(899) + 100),
                        "08/27",98765.54),
                new Card(id++, "4169738812345673",String.valueOf(random.nextInt(899) + 100),
                        "08/27",23452.54),
                new Card(id++, "4169738812345672",String.valueOf(random.nextInt(899) + 100),
                        "08/27",654.12),
                new Card(id++, "4169738812345676",String.valueOf(random.nextInt(899) + 100),
                        "08/27",1340.54),
                new Card(id++,"4169738812345677",String.valueOf(random.nextInt(899) + 100),
                        "08/27",700.92),
        };
    }


    static {
        int id = 1;
        users = new User[]{
                new User(id++,"Tural","Abbasov",
                        "turalabbasov","123456",
                        "ABCD001","+994555555555",
                        cards[0]),
                new User(id++,"Sukran","Mammadli",
                        "skrnmmdli","123457",
                        "ABCD002","+994555555556",
                        cards[1]),
                new User(id++,"Lamiya","Mirzammamdova",
                        "lamiyamirza","123458",
                        "ABCD003","+994555555557",
                        cards[2]),
                new User(id++,"Sahmardan","Rustamli",
                        "sahmardanrustamli","123459",
                        "ABCD004","+994555555558",
                        cards[3]),
                new User(id++,"Ali","Cabbarov",
                        "alicabbarov","123453",
                        "ABCD005","+994555555559",
                        cards[4]),
        };
    }


}
