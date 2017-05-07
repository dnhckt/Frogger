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
          GameArena game = new GameArena(500, 500); // Create game window
          Frog frog = new Frog(); // Create user character 
          Road road = new Road(); // Create background     
          Traffic traffic = new Traffic(); // Create traffic
                    
          // Add all creations to the game window        
          game.addRoad(road);   
          game.addFrog(frog);
          game.addTraffic(traffic);


         /* 
         While loop that starts the game.
         This loop controls the movement of the cars and the user's control of the frog.    
         */      
         
         while (true)
         {
            game.moveTraffic(traffic); // Initiliases traffic movement
             
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
