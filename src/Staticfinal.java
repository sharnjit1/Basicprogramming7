
class Extra {
   
    String username = "admin";
    
    public static int id  ;
    
    public static final int LUCKY_NUMBER = 7;
    
    
    Extra(){
        
       int counter = id++;
        
       
        System.out.println(counter);
    }
    
    
    public static void method(){
        
        System.out.println();
        
        
        
    }
    
    
}




public class Staticfinal {
    
    
    public static void main(String[] args) {
        
    
        Extra.method();
    
     Extra obj = new Extra();
     Extra obj1 = new Extra();
     Extra obj2= new Extra();
     
        System.out.println(obj.username);
    
        
        System.out.println(Extra.LUCKY_NUMBER);
        
        
        
        
        
    }
    
}

