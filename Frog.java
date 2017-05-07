/* 
    Frog 
    ===
    Creates the user character in the Frogger game, and allows user movement in the game.
    Author: Aidan Hackett
    
*/

public class Frog
{
      /* Variables for positioning */
      private double xPositionFrog, xPositionLimbLeft, xPositionLimbRight;
      private double yPositionBody, yPositionHead, yPositionArm, yPositionLeg;
      
      /* Variables for keyboard input to activate motion */
      private boolean upMotion, downMotion, leftMotion, rightMotion;
      
      private GameArena game; // To run the game 
      private Ball[] frogBody = new Ball[6]; // Array for frog body, head, limbs
      
      // Constructor - creates a blue frog character on-screen 
      public Frog ()
      {     
            xPositionFrog = 250; // Frog positioned in middle of screen
            yPositionBody = 490; // Frog positioned at the bottom of the screen
            yPositionHead = yPositionBody - 10; // Head is in front of body
            yPositionArm = yPositionBody - 5;  // Arms x-axis
            yPositionLeg = yPositionBody + 5;  // Legs x-axis 
            xPositionLimbLeft = xPositionFrog - 10; // Left hand limbs y-axis 
            xPositionLimbRight = xPositionFrog + 10; // Right hand limbs x-axis
            
            
            // Creates the shapes of the frog's body 
            frogBody[0] = new Ball(xPositionFrog, yPositionBody, 10, "BLUE");
            frogBody[1] = new Ball(xPositionFrog, yPositionHead, 8, "BLUE"); 
            frogBody[2] = new Ball(xPositionLimbLeft, yPositionArm, 3, "BLUE");
            frogBody[3] = new Ball(xPositionLimbLeft, yPositionLeg, 3, "BLUE");
            frogBody[4] = new Ball(xPositionLimbRight, yPositionArm, 3, "BLUE");
            frogBody[5] = new Ball(xPositionLimbRight, yPositionLeg, 3, "BLUE");
        }
      
     /* Required to add the frog to GameArena */ 
     public Ball[] getFrog()
     {
        return frogBody;
     } 
      
    /* 
        Methods walk[Direction]() Change the X and Y position of the frog. 
        The 'if' loops provide collision detection with edges of window, and the 'for' loops change the position of the frog.
    */  
           
    public void walkUp()
    {
        if(frogBody[1].getYPosition() >= 10) // Prevents walking off screen
        { 
            for(int i = 0; i < frogBody.length; i++)
                {
                    frogBody[i].setYPosition(frogBody[i].getYPosition()-20); // Moves the frog up 
                }
        }
    }  
    
    public void walkDown()
    {
        if(frogBody[0].getYPosition() <= 489)
        {
            for(int i = 0; i < frogBody.length; i++)
            {    
                frogBody[i].setYPosition(frogBody[i].getYPosition()+20);
            }
        }
    }
       
    public void walkLeft()
    {
        if(frogBody[2].getXPosition() >= 10)
        {
            for(int i = 0; i < frogBody.length; i++)
            {    
                frogBody[i].setXPosition(frogBody[i].getXPosition()-20);
            }
        }
    }   
    
    public void walkRight()
    {
        if(frogBody[4].getXPosition() <= 490)
        {
            for(int i = 0; i < frogBody.length; i++)
            {    
                frogBody[i].setXPosition(frogBody[i].getXPosition()+20);
            }
        }
            
    }
       
        
         
}
