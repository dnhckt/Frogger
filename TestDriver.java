/* 
    TestDriver
    =========
    Creates a working instance of the frogger game && constructs the rows of traffic that the user must avoid (should be moved to separate class).
    
    Use the direction keys to move the frog. If you hit a car, you lose.
    
    Author: Aidan Hackett

*/

public class TestDriver
{
    
    public static void main(String[] args)
    {
         double yPositionA, yPositionB, yPositionC, yPositionD; // Four different rows of traffic along the y-axis
         //v double xPosition; 
         double mv; // Used for traffic movement
        
         // Rectangle arrays to represent cars
         Rectangle[] laneA; 
         Rectangle[] laneB;
         Rectangle[] laneC;
         Rectangle[] laneD;

         int arrayLoop;
        
        /* Begin constructing four lanes (A-D) of cars */
       
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
               
        /* End construction of car lanes */ 

         GameArena game = new GameArena(500, 500); // Create game window
         Frog frog = new Frog(); // Add user character 
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


         /* 
         While loop that starts the game.
         This loop controls the movement of the cars and the user's control of the frog.    
         */      
         
         while (true)
         {
            /* Car movement is controlled by this loop 
            for (arrayLoop = 0; arrayLoop < 5; arrayLoop++)
                {
                    // First row of cars
                    mv = laneA[arrayLoop].getXPosition(); // Get X Position of lane of cars
                    laneA[arrayLoop].setXPosition(mv+30); // Move the cars along the screen.
                    game.pause(); // Refresh
                    if (mv >= 500) 
                    {
                         laneA[arrayLoop].setXPosition(0); // When the cars reach the end of the screen, reset X to 0
                    }   
                    
                    // Second row of cars
                    mv = laneB[arrayLoop].getXPosition();
                    laneB[arrayLoop].setXPosition(mv+5); // Smaller variable added to mv causes lower speed
                    game.pause();
                    if (mv >= 500)
                    {
                         laneB[arrayLoop].setXPosition(0);
                    } 
                    
                    // Third row of cars
                    mv = laneC[arrayLoop].getXPosition();
                    laneC[arrayLoop].setXPosition(mv+25);
                    game.pause();
                    if (mv >= 500)
                    {
                         laneC[arrayLoop].setXPosition(0);
                    } 
                    
                    // Fourth row of cars
                    mv = laneD[arrayLoop].getXPosition();
                    laneD[arrayLoop].setXPosition(mv+10);
                    game.pause();
                    if (mv >= 500)
                    {
                          laneD[arrayLoop].setXPosition(0);
                    }     
             }*/
         
            /* Accesses the frog walk methods to allow user movement */
            boolean upMotion = game.upPressed(); // If user presses the up key
            if (upMotion) 
            {
                  frog.walkUp();
                  game.pause();
            }
         
            boolean downMotion = game.downPressed();    
            if (downMotion)
            {
                  frog.walkDown();
                  game.pause();
            }
            
            boolean leftMotion = game.leftPressed();
            if (leftMotion)
            {
                  frog.walkLeft();
                  game.pause();
            }
            
            boolean rightMotion = game.rightPressed();
            if (rightMotion)
            {
                  frog.walkRight();
                  game.pause();
            }
         
           game.pause(); 
         }


    }
}
