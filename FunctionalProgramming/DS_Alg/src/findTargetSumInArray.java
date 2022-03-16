import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findTargetSumInArray {
    public static boolean isTargetSumPresent(int[] inputArr, int target){
        int sum =0;
        for(int i = 0; i<inputArr.length; i++){
            for(int j = i+1; j<inputArr.length; j++){
               sum = inputArr[i] + inputArr[j];
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isTargetSumPresentOptimized(int[] inputArr, int target){
        int diff =0;
       Map<Integer,Integer> inputMap = new HashMap<>();
        for(int i = 0; i<inputArr.length; i++){
            diff = target - inputArr[i];
            if(inputMap.containsKey(diff)){
                return true;
            }
            inputMap.put(inputArr[i],inputArr[i]);
        }
        return false;
    }
    public static boolean isTargetSumPresentOptimizedSet(int[] inputArr, int target){
        int diff =0;
        Set<Integer> inputSet = new HashSet<Integer>();
        for(int i = 0; i<inputArr.length; i++){
            diff = target - inputArr[i];
            if(inputSet.contains(diff)){
                return true;
            }
            inputSet.add(inputArr[i]);
        }
        return false;
    }
   public static void main(String[] args){
       int[] input = new int[] {1,2,4,4};
      System.out.println(isTargetSumPresentOptimizedSet(input,8));
   }
}
