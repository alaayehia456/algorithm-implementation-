import java.util.List;

public class selectionSort {


    public void sort(int [] array){

        for(int i=0;i<array.length;i++){

            int index=i;

            for(int j=i+1;j<array.length;j++){
                if(array[j] <  array[index]  ){
                    index = j;
                }
            }


            int smallerNumber=array[index];
          array[index]=array[i];
          array[i]=smallerNumber;




        }



    }


}
