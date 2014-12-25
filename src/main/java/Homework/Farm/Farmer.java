package Homework.Farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vmakaryan on 12/15/2014.
 */
public class Farmer {

    static boolean isWatered;

    public static List<Plant> GetPlantsFromMarketToFarm() {

        List<Plant> plantsToFarm = new ArrayList<Plant>();

        for (int i = 1; i <= Farm_App.farmSize; i++) {
            plantsToFarm.add(Market.getPlant());
        }

        return plantsToFarm;
    }

    public static boolean waterPlants(boolean b) {

        boolean isWatered = true;

        return isWatered;

    }

    public static void GatherHarvest(List<Plant> l) {

        if (!Farmer.isWatered) {

            System.out.println("Plants are not watered");

        }

            else;
            Map<String, Integer> tempplantsToFarm = new HashMap<String, Integer>();
            for (Plant value : l) {

                if(tempplantsToFarm.containsKey(value.getClass().getName())){
                    Integer prev = tempplantsToFarm.get(value.getClass().getName());
                    tempplantsToFarm.put(value.getClass().getName(),value.harvestAmount + prev);
                }
                else {
                    tempplantsToFarm.put(value.getClass().getName(), value.harvestAmount);
                }

            }

        System.out.println("Harvest:");

        for(Map.Entry<String,Integer> element: tempplantsToFarm.entrySet()){
            System.out.println(element.getKey().replace("Homework.Farm.", "") + " : " + element.getValue() );

            }

        }

    }





