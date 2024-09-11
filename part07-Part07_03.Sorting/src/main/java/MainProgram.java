import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);


    }
    
    public static int smallest(int[] array){
        int numberCompared=array[0];
        for(int number : array){
            if(number<numberCompared){
                numberCompared=number;
            }
        }
        return numberCompared;
    }
    public static int indexOfSmallest(int[] array){
    // write your code here
        int searched = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]==smallest(array)){
                searched = i;
                break;
            }
        }
        return searched;
    }
    
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
    // write your code here
        int smallestIndex = startIndex;
        for(int i = startIndex+1; i<array.length;i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }   
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int container = array[index1];
        array[index1]=array[index2];
        array[index2]=container;
    }
    
    
    public static void sort(int[] array) {
        
        for(int i=0;i<array.length;i++){
            System.out.print("[");
            for(int j=0;j<array.length;j++){
                System.out.print(array[j]);
                if(j<array.length-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            swap(array, i , indexOfSmallestFrom(array, i));
            
            
            
        }
        
        
        
    }


}
