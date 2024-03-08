package andraina.projects.lawnmower;

public class LawnMower {

    public Orientation orientation;

    public Position position;

    public LawnMower() {}

    public LawnMower(Orientation orientation, Position position) {
        this.orientation = orientation;
        this.position = position;
    }

    public void makeAMove(Instruction instruction) {
        switch (instruction) {
            case LEFT:
                this.turn(90);
                break;
            case RIGHT:
                this.turn(-90);
                break;
            case ADVANCE:
                this.moveForward();
                break;
            default:
                break;
        }
    }

    public void turn(int degree) {
        if (degree > 0) {
            this.turnLeft();
        } else if (degree < 0) {
            this.turnRight();
        }
    }

    public void turnLeft() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Orientation.WEST;
                break;
            case SOUTH:
                this.orientation = Orientation.EAST;
                break;
            case EAST:
                this.orientation = Orientation.NORTH;
                break;
            case WEST:
                this.orientation = Orientation.SOUTH;
                break;
            default:
                break;
        }
    }

    public void turnRight() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Orientation.EAST;
                break;
            case SOUTH:
                this.orientation = Orientation.WEST;
                break;
            case EAST:
                this.orientation = Orientation.SOUTH;
                break;
            case WEST:
                this.orientation = Orientation.NORTH;
                break;
            default:
                break;
        }
    }

    public void moveForward() {
        switch (this.orientation) {
            case NORTH:
                this.moveForwardY();
                break;
            case SOUTH:
                this.moveBackwardY();
                break;
            case EAST:
                this.moveForwardX();
                break;
            case WEST:
                this.moveBackwardX();
                break;
            default:
                break;
        }
    }

    public void moveForwardX() {
        this.position.setX(this.position.getX() + 1);
    }

    public void moveForwardY() {
        this.position.setY(this.position.getY() + 1);
    }

    public void moveBackwardX() {
        this.position.setX(this.position.getX() - 1);
    }

    public void moveBackwardY() {
        this.position.setY(this.position.getY() - 1);
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
