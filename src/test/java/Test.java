import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        for(int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        for (Integer x: arrayList)
            System.out.println(x);

        arrayList.remove(2);
        System.out.println(arrayList);

        }
    }

