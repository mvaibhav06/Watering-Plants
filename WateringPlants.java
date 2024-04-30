public class WateringPlants {
    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int cap = capacity;

        for(int i=0; i<plants.length; i++){
            if(cap >= plants[i]){
                cap -= plants[i];
                steps++;
            }else{
                steps += i;
                cap = capacity;
                steps += i+1;
                cap -= plants[i];
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        //[3,2,4,2,1] 6
//        1 cap-3
//        2 cap 1
//        2+2 -> 4+3 cap2
//        7+1 cap 0
//        8+4 cap 5
//        12+5 17
        int[] nums = {3,2,4,2,1};
        System.out.println(wateringPlants(nums,6));
    }
}
