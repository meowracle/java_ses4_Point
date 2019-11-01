public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D() {};

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    };

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {this.x , this.y};
        return array;
    }
    public String toString() {
        return "dau cham 2D co toa do x = " + getX() + " y = " + getY();
    }
}
