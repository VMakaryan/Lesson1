package Homework.Farm;

import java.util.Scanner;

/**
 * Created by vmakaryan on 12/15/2014.
 */
public class Farm_App {

    public static int farmSize;

    public static void main(String[] args) {

        System.out.println("PLease enter farm size ");

        Scanner console = new Scanner( System.in );

        farmSize = console.nextInt();

        System.out.println("Farm size =" + farmSize);

        Farmer.waterPlants(Farmer.isWatered = true);

        Farmer.GatherHarvest(Farmer.GetPlantsFromMarketToFarm());

    }
}
