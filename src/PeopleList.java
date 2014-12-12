import java.util.ArrayList;

public class PeopleList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ArrayList People = new ArrayList();
        Person p = new Person("Bob", 32);
        People.add(p); 
       People.add(new Person("John", 25)); 
       //add Cindy to front of line 
       People.add(new Person ("Cindy" , 7)); 
       //print all in arrayList 
       for(int x = 0; x<People.size(); x++) 
       { 
           p = (Person)People.get(x); 
           System.out.println(p);
       } 
       //Remove Bob 
       People.remove(1);
       
    }
    
}
