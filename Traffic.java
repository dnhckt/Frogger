

public class Traffic
{
    private double yPositionA, yPositionB, yPositionC, yPositionD;
    private double xPosition;
    private int value;
    private double mv;
    
    private Rectangle[] laneA;
    private Rectangle[] laneB;
    private Rectangle[] laneC;
    private Rectangle[] laneD;
    private Ball[] wLane;
    private GameArena game; 
    private int arrayLoop;
   
   // Constructor for a car 
   public Traffic()
   {
       
        // Constructs a lane of cars
        laneA = new Rectangle[5];
        yPositionA = 375;
        
        laneA[0] = new Rectangle(40, yPositionA, 50, 20, "PINK"); 
        laneA[1] = new Rectangle(140, yPositionA, 50, 20, "PINK");
        laneA[2] = new Rectangle(240, yPositionA, 50, 20, "PINK");        
        laneA[3] = new Rectangle(340, yPositionA, 50, 20, "PINK");     
        laneA[4] = new Rectangle(440, yPositionA, 50, 20, "PINK");
        
                
        laneB = new Rectangle[5];
        yPositionB = 325;
        
        laneB[0] = new Rectangle(40, yPositionB, 50, 20, "GREEN"); 
        laneB[1] = new Rectangle(140, yPositionB, 50, 20, "GREEN");
        laneB[2] = new Rectangle(240, yPositionB, 50, 20, "GREEN");        
        laneB[3] = new Rectangle(340, yPositionB, 50, 20, "GREEN");       
        laneB[4] = new Rectangle(440, yPositionB, 50, 20, "GREEN");
        
        
        laneC = new Rectangle[5];
        yPositionC = 275;
        
        laneC[0] = new Rectangle(40, yPositionC, 50, 20, "RED"); 
        laneC[1] = new Rectangle(140, yPositionC, 50, 20, "RED");
        laneC[2] = new Rectangle(240, yPositionC, 50, 20, "RED");        
        laneC[3] = new Rectangle(340, yPositionC, 50, 20, "RED");       
        laneC[4] = new Rectangle(440, yPositionC, 50, 20, "RED");
        
              
        laneD = new Rectangle[5];
        yPositionD = 225;
        
        laneD[0] = new Rectangle(40, yPositionD, 50, 20, "ORANGE"); 
        laneD[1] = new Rectangle(140, yPositionD, 50, 20, "ORANGE");
        laneD[2] = new Rectangle(240, yPositionD, 50, 20, "ORANGE");        
        laneD[3] = new Rectangle(340, yPositionD, 50, 20, "ORANGE");       
        laneD[4] = new Rectangle(440, yPositionD, 50, 20, "ORANGE");
                
     /*
        wLane[0] = new Ball(40, 375, 8, "BLACK");  
        wLane[1] = new Ball(140, 375, 8, "BLACK");  
        wLane[2] = new Ball(240, 375, 8, "BLACK");  
        wLane[3] = new Ball(340, 375, 8, "BLACK");          
        wLane[4] = new Ball(440, 375, 8, "BLACK");  
        wLane[5] = new Ball(40, 325, 8, "BLACK");  
        wLane[6] = new Ball(140, 325, 8, "BLACK");  
        wLane[7] = new Ball(240, 325, 8, "BLACK");  
        wLane[8] = new Ball(340, 325, 8, "BLACK");          
        wLane[9] = new Ball(440, 325, 8, "BLACK");  
        wLane[10] = new Ball(40, 275, 8, "BLACK");  
        wLane[11] = new Ball(140, 275, 8, "BLACK");  
        wLane[12] = new Ball(240, 275, 8, "BLACK");  
        wLane[13] = new Ball(340, 275, 8, "BLACK");          
        wLane[14] = new Ball(440, 275, 8, "BLACK");  
        wLane[15] = new Ball(40, 225, 8, "BLACK");  
        wLane[16] = new Ball(140, 225, 8, "BLACK");  
        wLane[17] = new Ball(240, 225, 8, "BLACK");  
        wLane[18] = new Ball(340, 225, 8, "BLACK");          
        wLane[19] = new Ball(440, 225, 8, "BLACK");  */
        
     }

     public void addTo(GameArena game)
     {         
            for (arrayLoop = 0; arrayLoop < 5; arrayLoop++)
            {
                game.addRectangle(laneA[arrayLoop]);
                game.addRectangle(laneB[arrayLoop]);
                game.addRectangle(laneC[arrayLoop]);
                game.addRectangle(laneD[arrayLoop]);                
            }          
                              
     }     
     
     
     // Method to make the traffic move 
     public void move(GameArena game)
     {
          while (true)
          {

                for (arrayLoop = 0; arrayLoop < 5; arrayLoop++)
                {
                    mv = laneA[arrayLoop].getXPosition();
                    laneA[arrayLoop].setXPosition(mv+30);
                    game.pause();
                    if (mv >= 500)
                    {
                         laneA[arrayLoop].setXPosition(0);
                    }   
             
                    mv = laneB[arrayLoop].getXPosition();
                    laneB[arrayLoop].setXPosition(mv+5);
                    game.pause();
                    if (mv >= 500)
                    {
                         laneB[arrayLoop].setXPosition(0);
                    } 
                    
                    
                    mv = laneC[arrayLoop].getXPosition();
                    laneC[arrayLoop].setXPosition(mv+25);
                    game.pause();
                    if (mv >= 500)
                    {
                         laneC[arrayLoop].setXPosition(0);
                    } 
                    
                    mv = laneD[arrayLoop].getXPosition();
                    laneD[arrayLoop].setXPosition(mv+10);
                    game.pause();
                    if (mv >= 500)
                    {
                          laneD[arrayLoop].setXPosition(0);
                    }     
                }
   
          }
      
     }
     
     
}








         
