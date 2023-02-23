

public class Ball {


    //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

    //Creating the properties of ball
    private double velocity;
    private double angle;
    private double x;
    private double y;

    //Creating the BAll constructor
    public Ball(double velocity, double angle, double x, double y) {
        this.velocity = velocity;
        this.angle = angle;
        this.x = x;
        this.y = y;
    }

    //Creating set method to change velocity in GameScene class
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    //Creating an another constructor to create the velocity of ball as an integer
    public Ball(int velocity) {
        this.velocity = velocity;
    }


    //Creating get method to reach the velocity of ball when we need
    public double getVelocity() {
        return this.velocity;
    }

    //DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

}

