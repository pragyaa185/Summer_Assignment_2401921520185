class Solution {
    public int[] dailyTemperatures(int[] temp){
        int totaldays = temp.length;
        int[] daystowait=new int[totaldays];
        Stack<Integer>indexStack =new Stack<>();

        for (int cday=0; cday<totaldays;cday++) {
            while (!indexStack.isEmpty()&&temp[cday]>temp[indexStack.peek()]){
                int preday= indexStack.pop();
                daystowait[preday]=cday-preday;

            }
            indexStack.push(cday);



        }
        return daystowait;
        
    }
}