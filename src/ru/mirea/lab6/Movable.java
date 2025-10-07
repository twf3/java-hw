package ru.mirea.lab6;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: x = " + x + ", " + "y = " + y + ", " + "xSpeed = " + xSpeed + ", " + "ySpeed = " + ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    // метод для сравнения точек для прямоугольника (№2)
    public boolean sameSpeed(MovablePoint other) {
        return this.xSpeed == other.xSpeed && this.ySpeed == other.ySpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle: center=" + center.toString() + ", radius=" + radius + "]";
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp() {
        if (topLeft.sameSpeed(bottomRight)) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown() {
        if (topLeft.sameSpeed(bottomRight)) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveLeft() {
        if (topLeft.sameSpeed(bottomRight)) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    public void moveRight() {
        if (topLeft.sameSpeed(bottomRight)) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public String toString() {
        return "Rectangle: top left: " + topLeft + "; bottom right: " + bottomRight + ")";
    }

}

