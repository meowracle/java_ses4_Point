public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D() {
    }

    ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = {this.x, this.y, this.z};
        return array;
    }

    public String toString() {
        return "Dau cham 3D la lop ke thua cua " + super.toString() + " va co z = " + getZ();
    }
}
