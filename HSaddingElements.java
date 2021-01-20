package JavaPack1;

import java.util.*;
class HashSet1{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Four"); // duplicate values are not added
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        set.remove("Two");
        System.out.println("After removing Two  "+ set);
        set.add("User1");
        HashSet<String> obj1 = new HashSet<String>();
        obj1.add("user2");
        obj1.add("user3Ajay");
        obj1.add("user4");
        System.out.println("second HashSet  "+ obj1);

        set.addAll(obj1); //adding obj1  elements to set
        System.out.println("After adding second HashSet to set1  "+ set);
        //remove the element if it contains Ajay
        set.removeIf(str->str.contains("Ajay"));
        System.out.println("After invoking removeIf() method: "+set);


        set.removeAll(obj1);  //removing obj1  elements from set
        System.out.println("After removing all obj1 elements from set  "+ set);

        set.clear();
        System.out.println("Afetr clear HashSet  "+ set);






    }
}  