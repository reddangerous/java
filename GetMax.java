public class GetMax {
    public static void main(String[] args) {
      int [] numbers ={126, 1670,95,170,270};
      int max = getMaxvalue(numbers);
      System.out.println("max="+max);
      
    }
    public static int getMaxvalue(int[]passedArray){
        int currentMax = passedArray[0];
        for (int i=1;i<passedArray.length;i++){
            if(passedArray.length[i]>currentMax){
                currentMax=passedArray[i];
            }
        }
        return currentMax;
    }
    
}
