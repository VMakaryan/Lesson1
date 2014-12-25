package Homework.Farm;


/**
 * Created by vmakaryan on 12/15/2014.
 */
public class Market {

    public static Plant getPlant() {

        int rndPlant = (int) (1 + (Math.random() * 3));

        switch (rndPlant) {
            case 1:
                return new Apple(1);

            case 2:
                return new Peach(2);

            case 3:
                return new Plum(3);

            case 4:
                return new Orange(4);

        }

        return null;
    }

}



