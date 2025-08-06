/* Program: Water Bottle Exchange Problem
   Author: Dileep Prasanth
   Description:
     This program calculates the total number of water bottles you can drink
     given an initial number of bottles and an exchange rate for empty bottles.
     Problem inspired by LeetCode 1518.*/
import java.util.Scanner;
public class WaterBottleExchange 
{
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles; 

        while (numBottles >= numExchange) 
        {
            int newBottles = numBottles / numExchange; 
            int remainder = numBottles % numExchange;  
            ans += newBottles;
            numBottles = newBottles + remainder; 
        }return ans;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bottles you initially have: ");
        int numBottles = sc.nextInt();
        System.out.print("Enter the number of empty bottles required for an exchange: ");
        int numExchange = sc.nextInt();
        WaterBottleExchange solution = new WaterBottleExchange();
        int result = solution.numWaterBottles(numBottles, numExchange);
        System.out.println("Total number of bottles you can drink: " + result);
        sc.close();
    }
}
