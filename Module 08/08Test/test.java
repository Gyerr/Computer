import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main (String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(0, 6);
        myList.add(1, 3);
        myList.add(2, 9);
        myList.add(3, 4);
        myList.add(4, 8);
        myList.add(5, 2);

        removeEvens(myList);
        System.out.println(myList);
    }
    public static ArrayList<Integer> removeEvens(ArrayList<Integer> myList)

{

for (int i = 0; i < myList.size(); i++)

{

if (myList.get(i) % 2 == 0)

{

myList.remove(i);

}

}

return myList;
     


}
}