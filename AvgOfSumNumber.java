public class AvgOfSumNumber {
    public static void main(String[] x){
        int arr[] = {-2,5,0,-9,-3,-6,-8};
        int sum = 0;
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0){
                sum += arr[i];
                count++;
            } else{
                System.out.println("There is no Positive number in The array");
                break;
            }
        }
        double res = (double)sum/count;
        System.out.println("Average of sum number: "+res);
        
    }
}
