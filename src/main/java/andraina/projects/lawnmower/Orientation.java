package andraina.projects.lawnmower;

public enum Orientation {

    NORTH('N'),
    SOUTH('S'),
    EAST('E'),
    WEST('W');

    private final char value;

    Orientation(char orientation) {
        this.value = orientation;
    }
}
