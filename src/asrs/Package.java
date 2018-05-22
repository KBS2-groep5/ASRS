package asrs;

public class Package {
    private final String name;
    private final int x;
    private final int y;
    private final int height;

    public Package(String name, int x, int y, int height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Package{" + "name=" + name + ", x=" + x + ", y=" + y + ", height=" + height + '}';
    }
}
