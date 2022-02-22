public class evenNumbers {
    public static void main(String[] args) {
        int [] evenNumbers;
        evenNumbers=new int[10];
        for(int i=0;i<=evenNumbers.length;i++){
            evenNumbers [i]=(i+1)*2;
            
        }
        for(int i=0;i<evenNumbers.length;i++){
            System.out.println(evenNumbers[i]+" ");
        }
    }
    
}
