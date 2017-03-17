
  /* Name: Frogger Background
   *
   *
   * Function: Generates the background image of a road for the game
   * Author: Aidan Hackett
   */




public class Road
{ 
     
       private Rectangle Road;
       private Rectangle topCurb;
       private Rectangle bottomCurb;
       private Rectangle[] roadElements = new Rectangle[14];
       private Rectangle frogLine;       
       
       
       private double initialRoadXPosition;
       private int loop;  
       private double RoadXPosition;
          
       // Constructor for the image      
       public Road()
       {
            initialRoadXPosition = 10;
          
            // Starting line and road 
            
            roadElements[0] = new Rectangle(0, 300, 1000, 200, "BLACK");
            roadElements[1] = new Rectangle(0, 200, 1000, 6, "DARKGREY");
            roadElements[2] = new Rectangle(0, 400, 1000, 6, "DARKGREY");
            roadElements[3] = new Rectangle(0, 490, 1000, 30, "BROWN");            
            
            
            roadElements[4] = new Rectangle(initialRoadXPosition, 300, 10, 5, "WHITE");           
            
            for (loop = 5; loop < 14; loop++)
            {
               RoadXPosition = initialRoadXPosition + (60*loop);    
               roadElements[loop] = new Rectangle(RoadXPosition, 300, 10, 5, "WHITE"); 
            }

               
   
       }
       
       public Rectangle[] getRoad() {
            return roadElements;
       } 
      
         


        
    
     
}
