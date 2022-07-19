import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String [] args){

        int[] array={3,4,6,1,2,6,324,0};


        selectionSort s=new selectionSort();
        s.sort(array);

for(int i:array){
    System.out.println(i);
}



    }





}
