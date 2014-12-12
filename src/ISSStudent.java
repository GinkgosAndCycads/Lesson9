public class ISSStudent implements Comparable {
    private String name; 
    private String address; 
    private int id; 
    
    public ISSStudent(String n, String a, int id){ 
        name = n; 
        address = a; 
        this.id = id;
    } 
    
    public int getId(){ 
        return id;
    }

    public String toString(){ 
        String str = "Name:\t" + name; 
        str+="\nAddress:\t" + address; 
        str+="\nID Number\t" + id; 
        return str;
      }  
    public int compareTo(Object o){ 
      int difference = id - ((ISSStudent)o).getId(); 
      return difference;
    }
    

}