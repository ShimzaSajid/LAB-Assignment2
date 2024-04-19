import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList<Pc> List = new ArrayList<>();

    List.add(new Pc(1,"i3","16GB","234SSD","Dell",true));
//Display arraylist
//        System.out.println("Pc list:");
//        for(Pc pc : List ){
//            System.out.println(pc);
//        }
//        System.out.print("Size of list:");
//        System.out.println(List.size());
        //REMOVE
//        List.remove(0);
//        System.out.println("Pc list after removal:");
//        //Print
//        for(Pc pc : List ){
//            System.out.println(pc);
//        }
        //next object
        ArrayList<Pc> add_all = new ArrayList<>();
        add_all.add(new Pc(2,"i7","12GB","213SSD","Dell",false));
        add_all.add(new Pc(3,"i4","17GB","876SSD","Dell",true));
        add_all.add(new Pc(4,"i5","19GB","876SSD","Dell",true));
        add_all.add(new Pc(5,"i6","22GB","876SSD","Dell",true));
        add_all.add(new Pc(6,"i8","33GB","876SSD","Dell",true));
        add_all.add(new Pc(7,"i9","44GB","876SSD","Dell",true));
        add_all.add(new Pc(8,"i12","55GB","876SSD","Dell",true));
        add_all.add(new Pc(9,"i13","66GB","876SSD","Dell",true));
        add_all.add(new Pc(10,"i19","77GB","876SSD","Dell",true));
        List.addAll(add_all);
  //PRINT
//        for(Pc pc : List ) {
//            System.out.println(pc);
//        }
//        //SIZE OD ADD_ALL OBJECT
//        System.out.print("Size of add_all:");
//        System.out.println(add_all.size());
//
//        List.remove(new Pc(2,"i7","12GB","213SSD","Dell",false));
//        System.out.println("Pc list after removal");
//        for(Pc pc : List ) {
//
//            System.out.println(pc);
//        }
//        List.set(0,new Pc(1,"i67","20GB",
//                "1177SSD","CORE",false));
//        System.out.println("After update");
//        for(Pc pc : List ) {
//
//            System.out.println(pc);
//        }

        for(int i=0;i<List.size();i++)
                List.get(i).setID(List.get(i).getID() + 2);
        for(Pc pc : List ) {

            System.out.println(pc);
        }
//        List.addAll(2,add_all);
//        for(Pc pc : List ){

//            System.out.println(pc);
//        }




    }
}