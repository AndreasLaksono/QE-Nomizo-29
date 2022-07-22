package Utils;

import java.util.Random;

public class email {

    Random rand = new Random();

    public String randomEmail() {
        return "qenomizo" + rand.nextInt(1000) + "@gmail.com";
    }
}
