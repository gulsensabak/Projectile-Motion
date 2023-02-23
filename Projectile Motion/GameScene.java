
import java.util.ArrayList;

public class GameScene {

    // Data Fields
    private ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
    private Ball ball;

    private int targetX;
    private int targetY = 0;

    private static final int MAX_ANGLE = 90;
    private static final int MAX_VELOCITY = 100;
    private static final int MIN_VELOCITY = 20;

    //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE


    //Creating set method for targetX to reach targetX
    public void setTargetX(int targetX) {
        this.targetX = targetX;
    }

    //Creating GameScene constructor
    public GameScene(ArrayList<Obstacle> obstacles, Ball ball, int targetX) {
        this.ball= ball;
        this.obstacles= obstacles;
        this.targetX= targetX;

    }

    //DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE


    public double findVelocity(double angle) {

        //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

        //Converting angle from degrees to radian
        angle= angle*Math.PI/180;

        //Controlling the magnitute of velocity
        if(ball.getVelocity()<20) {
            return -1;
        }

        //Controlling the magnitute of velocity
        if(ball.getVelocity()>100) {
            return -1;
        }

        //Controlling the angle of ball
        if(angle>Math.PI/2) {
            return -1;
        }

        //Comparing the distance that ball may reach with targetX
        if(2*ball.getVelocity()*Math.sin(angle)*ball.getVelocity()*Math.cos(angle)/9.81!= targetX) {
            //Changing the velocity of ball by using set method
            ball.setVelocity(Math.sqrt((9.81*targetX/(2*Math.sin(angle)*Math.cos(angle)))));
        }

        //Creating for loop to compare the properties of all obstacles with the instant height of ball
        for (int i = 0; i < obstacles.size(); i++) {
            double time= obstacles.get(i).getX()/ball.getVelocity()*Math.cos(angle);
            double compareheight= obstacles.get(i).getX()*Math.tan(angle)-((9.81/2)*(Math.pow(obstacles.get(i).getX()/(ball.getVelocity()*Math.cos(angle)), 2)));
            //Determine the height of ball when the ball reach the same x position with obstacle
            double compareheight1= (obstacles.get(i).getX()+obstacles.get(i).getWidth())*Math.tan(angle)-((9.81/2)*(Math.pow((obstacles.get(i).getX()+obstacles.get(i).getWidth())/(ball.getVelocity()*Math.cos(angle)), 2)));

            //Comapring the height of obstacle and ball
            if(compareheight>obstacles.get(i).getHeight() && compareheight1>obstacles.get(i).getHeight()) {
                return ball.getVelocity();
            }

            //If compare height is smaller than obstacle height, then it will hit. So return -1
            else {
                return -1;
            }
        }


        return 1;

        //DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
    }
}


