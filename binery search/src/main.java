import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String  [] args){
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(15);
        list.add(25);
        list.add(29);
        list.add(30);
        list.add(60);
        list.add(110);

        binarySearch b=new binarySearch();
        int last=list.size()-1;
        int a= b.binary(list,0,last,25);

        if(a == -1){
            System.out.println("this item is not founded");
        }else {
            System.out.println(a);
        }


    }


}
