import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    List<Pc> List = new ArrayList<>();

    Pc pc1= new Pc(1,"i3","16GB","234SSD","Dell",true);
    Pc pc2 =new Pc(7,"i7","12GB","213SSD","HP",false);
    Pc pc3= new Pc(8,"i4","17GB","876SSD","Dell",true);
    Pc pc4= new Pc(22,"i5","19GB","543SSD","CORE",false);
    Pc pc5 =new Pc(13,"i6","22GB","854SSD","HP",true);
    Pc pc6 =new Pc(16,"i8","33GB","112SSD","HP",false);
    Pc pc7 =new Pc(11,"i9","44GB","943SSD","Dell",false);
    Pc pc8 =new Pc(23,"i12","55GB","245SSD","HP",true);
    Pc pc9= new Pc(27,"i13","66GB","644SSD","Dell",true);
    Pc pc10 =new Pc(3,"i19","77GB","843SSD","CORE",false);
    List.add(pc1);
        List.add(pc2);
        List.add(pc3);
        List.add(pc4);
        List.add(pc5);
        List.add(pc6);
        List.add(pc7);
        List.add(pc8);
        List.add(pc9);
        List.add(pc10);
        List<Pc> List2 = new ArrayList<>();
       List2.addAll(List);
       //PRINTING ALL ENTRIES
        System.out.println("Original List:");
        for(Pc pc : List2 ){
            System.out.println(pc);
        }
        System.out.println("-------------------------------------------------------------------");
        //PRINTING SIZE OF LIST
        System.out.print("Size of list:");
        System.out.println(List2.size());
        System.out.println("-------------------------------------------------------------------");
        List.sort(null);
        System.out.println("Sorted List:");
        for(Pc pc: List){
            System.out.println(pc);
        }
        System.out.println("-------------------------------------------------------------------");
        //PRINTING SIZE OF LIST
        System.out.print("Size of list:");
        System.out.println(List2.size());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Increamented List:" );
        for(int i=0;i<List2.size();i++)
            List2.get(i).setID(List2.get(i).getID() + 2);
        for(Pc pc : List2 ) {

            System.out.println(pc);
        }

        System.out.println("-------------------------------------------------------------------");
        //REMOVING SELECTED PC'S FROM LIST
        List2.remove(pc3);
        List2.remove(pc8);
        System.out.println("Pc list after removal");
        for(Pc pc : List2 ) {

            System.out.println(pc);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Size of list:");
        System.out.println(List2.size());
        System.out.println("-------------------------------------------------------------------");
        Collections.reverse(List2);
        System.out.println("After reversing:");
        for(Pc pc:List2){
            System.out.println(pc);
        }
        System.out.println("-------------------------------------------------------------------");
        List2.set(0,new Pc(1,"i67","20GB",
                "1177SSD","CORE",false));
        System.out.println("After update");
        for(Pc pc : List2 ) {

            System.out.println(pc);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Size of list:");
        System.out.println(List2.size());
        System.out.println("-------------------------------------------------------------------");




    }
}