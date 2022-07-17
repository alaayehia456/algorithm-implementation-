import java.util.List;

public class binarySearch {



    public int binary(List<Integer> array,int first,int last,int key){

        if(last>=first){

            int mid=first + (last - first)/2;
            if(array.get(mid) == key){
                return mid;
            }

            if(array.get(mid) > key ){
                return binary(array,first,mid-1,key);
            }else {
                return binary(array,mid+1,last,key);
            }


        }else {
            return -1;
        }









    }


}
