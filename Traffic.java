/* 
    Traffic
    ===
    Creates the moving traffic in the Frogger game, which the user must avoid.
    Author: Aidan Hackett
  
*/

public class Traffic
{
    double yPositionA, yPositionB, yPositionC, yPositionD; // Four different rows of traffic along the y-axis
    private double xPosition; 
    private double mv; // Used for traffic movement
    
    // Rectangle arrays to represent cars
    private Rectangle[] laneA;
    private Rectangle[] laneB;
    private Rectangle[] laneC;
    private Rectangle[] laneD;
    
    private int arrayLoop;
   
   // Constructor for a car 
   public Traffic()
   {
       
        /* Begin constructing four lanes (A-D) of cars */
       
        laneA = new Rectangle[4];
        yPositionA = 375;
        
        laneA[0] = new Rectangle(40, yPositionA, 50, 20, "PINK"); 
        laneA[1] = new Rectangle(140, yPositionA, 50, 20, "PINK");
        laneA[2] = new Rectangle(240, yPositionA, 50, 20, "PINK");        
        laneA[3] = new Rectangle(340, yPositionA, 50, 20, "PINK");     
        
                
        laneB = new Rectangle[4];
        yPositionB = 325;
        
        laneB[0] = new Rectangle(40, yPositionB, 50, 20, "GREEN"); 
        laneB[1] = new Rectangle(140, yPositionB, 50, 20, "GREEN");
        laneB[2] = new Rectangle(240, yPositionB, 50, 20, "GREEN");        
        laneB[3] = new Rectangle(340, yPositionB, 50, 20, "GREEN");       
        
        
        laneC = new Rectangle[5];
        yPositionC = 275;
        
        laneC[0] = new Rectangle(40, yPositionC, 50, 20, "RED"); 
        laneC[1] = new Rectangle(140, yPositionC, 50, 20, "RED");
        laneC[2] = new Rectangle(240, yPositionC, 50, 20, "RED");        
        laneC[3] = new Rectangle(340, yPositionC, 50, 20, "RED");       
        
              
        laneD = new Rectangle[5];
        yPositionD = 225;
        
        laneD[0] = new Rectangle(40, yPositionD, 50, 20, "ORANGE"); 
        laneD[1] = new Rectangle(140, yPositionD, 50, 20, "ORANGE");
        laneD[2] = new Rectangle(240, yPositionD, 50, 20, "ORANGE");        
        laneD[3] = new Rectangle(340, yPositionD, 50, 20, "ORANGE");      
        
        /* End car lane construction */
               
        
   }     
     
     public Rectangle[] getTrafficA()
     {
        return laneA;
     }
     public Rectangle[] getTrafficB()
     {
        return laneB;
     }
      public Rectangle[] getTrafficC()
     {
        return laneC;
     }
     
      public Rectangle[] getTrafficD()
     {
        return laneD;
     } 

     
     
     
}








         
