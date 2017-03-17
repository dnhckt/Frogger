public class Frog
{
      private double xPositionFrog, xPositionLimbLeft, xPositionLimbRight;
      private double yPositionBody, yPositionHead, yPositionArm, yPositionLeg;
      private double move;
      private boolean motion;
        
      private Ball body;
      private Ball head; 
      private Ball leftArm;
      private Ball leftLeg;
      private Ball rightArm;
      private Ball rightLeg;
      private Rectangle stripe;
      private GameArena game; 
      private Ball[] frogBody = new Ball[6];
      
      // Constructor for Frog
      public Frog ()
      {     
            xPositionFrog = 250;
            yPositionBody = 490;
            yPositionHead = yPositionBody - 10;
            yPositionArm = yPositionBody - 5;
            yPositionLeg = yPositionBody + 5;
            xPositionLimbLeft = xPositionFrog - 10;
            xPositionLimbRight = xPositionFrog + 10;
            
            frogBody[0] = new Ball(xPositionFrog, yPositionBody, 10, "BLUE");
            frogBody[1] = new Ball(xPositionFrog, yPositionHead, 8, "BLUE"); 
            frogBody[2] = new Ball(xPositionLimbLeft, yPositionArm, 3, "BLUE");
            frogBody[3] = new Ball(xPositionLimbLeft, yPositionLeg, 3, "BLUE");
            frogBody[4] = new Ball(xPositionLimbRight, yPositionArm, 3, "BLUE");
            frogBody[5] = new Ball(xPositionLimbRight, yPositionLeg, 3, "BLUE");

            
          //  stripe = new Rectangle(xPositionFrog, yPositionBody, 1, 1, "BLACK");
        }
       
     public Ball[] getFrog(){
        return frogBody;
     } 
             
    public void walk()
    {
        for(int i = 0; i < frogBody.length; i++)
        {
            frogBody[i].setYPosition(frogBody[0].getYPosition()-20);        
        }
    }  
       
        
         
}
