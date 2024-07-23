import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int [] intarray = {1,2,4,5};
        int missingnum = findmissingInt(intarray);
        System.out.println(findmissingInt(intarray));
        System.out.println(Arrays.toString(insertmissingnum(missingnum,intarray)));

    }
    public static int findmissingInt ( int [] intarray) {
        for(int i = 0; i < intarray.length; i++){
            if(intarray[i + 1] - intarray[i] > 1 ){
                return intarray[i] + 1;
            }
        }return 0;


    }
    public static int [] insertmissingnum (int missingnum, int [] intarray){
        int [] newArray = new int [intarray.length + 1];
        for(int i = 0; i < intarray.length; i++){
            newArray[i] = intarray[i];
        } newArray[newArray.length -1] = missingnum;
        Arrays.sort(newArray);
        return newArray;
    }

}