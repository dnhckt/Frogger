
public class TestDriver
{

             
    
    
    
    public static void main(String[] args)
    {
     double yPositionA, yPositionB, yPositionC, yPositionD;
     double xPosition;
     int value;
     double mv;
    
     Rectangle[] laneA;
     Rectangle[] laneB;
     Rectangle[] laneC;
     Rectangle[] laneD;
     Ball[] wLane;

        int arrayLoop;
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
               
    

         GameArena game = new GameArena(500, 500);
         Frog frog = new Frog();
         //Traffic vehicle = new Traffic();
         Road road = new Road();        

         //vehicle.addTo(game);
         //vehicle.move(game);
            game.addRoad(road);
            for (arrayLoop = 0; arrayLoop < 5; arrayLoop++)
            {
                game.addRectangle(laneA[arrayLoop]);
                game.addRectangle(laneB[arrayLoop]);
                game.addRectangle(laneC[arrayLoop]);
                game.addRectangle(laneD[arrayLoop]);                
            }          
            game.addFrog(frog);



         
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
         
            boolean motion = game.upPressed();    
            if (motion)
            {
                  frog.walk();
                  game.pause();
                  System.out.println("test");
            }
         
            game.pause(); 
         }


    }
}
