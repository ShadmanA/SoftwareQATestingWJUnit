package lab1q1;

public class ArrayMult {
    
    public int [] mult(int [] array1, int[] array2){
        
        int minlen;
        int [] longArray;
        
        //check which array is smaller
        if(array1.length <= array2.length){
            minlen = array1.length;
            longArray = array2;
        } else {
            minlen = array2.length;
            longArray = array1;
        }
        int [] outArray = new int[longArray.length];
        for(int i = 0; i < minlen; i++){
            outArray[i] = array1[i] * array2[i];
        }
        for(int j = longArray.length -1; j >= minlen; j--){
            outArray[j] = longArray[j];
        }
        return outArray;
    }
}
