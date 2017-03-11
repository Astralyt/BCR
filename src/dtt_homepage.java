import com.mongodb.MongoClient;


public class dtt_homepage {

   public static void main( String args[] ) {
	
      try{
		
         // To connect to mongodb server
        
		MongoClient mc=new MongoClient();	
         // Now connect to your databases
        
        
         
         System.out.println("Connect to database successfully");
         
			
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}