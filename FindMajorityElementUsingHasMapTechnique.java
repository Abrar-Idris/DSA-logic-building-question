import java.util.HashMap;

public class FindMajorityElementUsingHasMapTechnique {
    public static void main(String[] args) {
          int arr[]={2,2,1,2,3,2,2};

          HashMap<Integer,Integer> map = new HashMap<>();

          //frequency count 
          for(int i =0; i<arr.length;i++){
            map.put(arr[i],
                map.getOrDefault(arr[i],0)+1
            );
          }

          //find majority element 
          for(int key: map.keySet()){
            if(map.get(key)>arr.length/2){
                System.out.println("Majority element "+key);
            }else{
                 System.out.println("not exist Majority element ");
            }
          }
    }
}
