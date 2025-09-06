import java.util.*;
class Solution
{
    public double average(int[] salary)
    {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];
        for(int i = 1; i < salary.length; i++){
            if(max < salary[i])
            {
                max = salary[i];
            }else if(min > salary[i]){
                min = salary[i];
            }sum = sum + salary[i];
        }
        sum = sum-min-max;
        double ans = (double)sum/(salary.length-2);
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of salaries: ");
        int n = sc.nextInt();
        int[] salary = new int[n];
        System.out.println("Enter the salaries:");
        for(int i = 0; i < n; i++)
        {
            salary[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        double result = obj.average(salary);
        System.out.println("Average salary (excluding min and max): " + result);
    }
}
