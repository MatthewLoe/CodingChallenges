/*
 * Assumes rectangle is not tilted
 */
public class RectanglesOverlapping
{
    public static void main(String args[])
    {
        RectanglesOverlapping obj = new RectanglesOverlapping();
        Point l1 = obj.new Point(-10, 10);    //Top left
        Point r1 = obj.new Point(0, 0);    //Bottom right
        Point l2 = obj.new Point(-5, 5);     //Top left
        Point r2 = obj.new Point(5, 0);    //Bottom right

        Rectangle first = obj.new Rectangle(l1,r1);
        Rectangle second = obj.new Rectangle(l2,r2);

        System.out.println("Does the first rectangle overlap the second?");
        System.out.println(first.overlap(second));
    }   

    public class Point
    {
        private int x;
        private int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }
    }

    public class Rectangle
    {
        private Point topLeft;
        private Point bottomRight;

        public Rectangle(Point topLeft, Point bottomRight)
        {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public boolean overlap(Rectangle other)
        {
            if (topLeft.getX() < other.getBottomRight().getX()      //Right side of other overlaps
                || topLeft.getY() > other.getBottomRight().getY()   //Bottom of other overlaps
                || bottomRight.getX() > other.getTopLeft().getX()   //Left side of other overlaps
                || bottomRight.getY() < other.getTopLeft().getY())  //Top of other overlaps
            {
                return true;
            }
            else
            {
                return false;
            }

        }

        public Point getTopLeft()
        {
            return topLeft;
        }

        public Point getBottomRight()
        {
            return bottomRight;
        }
    }
}