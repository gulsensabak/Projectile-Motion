
public class Obstacle {

    //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE


    //Creating the properties of obstacles
    private int width;
    private int height;
    private double x;
    private double y;

    //Creating the constructor for obstacles
    public Obstacle(int width, int height, int x) {
        this.width= width;
        this.height= height;
        this.x= x;
    }

    //Creating get method to reach X when we need to use x
    public double getX() {
        return this.x;
    }

    //Creating get method to reach height when we need to use height of obstacle
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    //DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE



}

