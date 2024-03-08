package andraina.projects.lawnmower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LawnMowerTest {

    private LawnMower lawnMower = new LawnMower(Orientation.NORTH, new Position(3,6));

    @Test
    void givenLawnMower_whenMakeAMove_thenReturnNewPosition() {
        lawnMower.makeAMove(Instruction.LEFT);
        lawnMower.makeAMove(Instruction.ADVANCE);
        assertEquals(Orientation.WEST, lawnMower.getOrientation());
        assertEquals(2, lawnMower.getPosition().getX());

        lawnMower.makeAMove(Instruction.RIGHT);
        lawnMower.makeAMove(Instruction.ADVANCE);
        assertEquals(Orientation.NORTH, lawnMower.getOrientation());
        assertEquals(7, lawnMower.position.getY());

        lawnMower.makeAMove(Instruction.RIGHT);
        lawnMower.makeAMove(Instruction.ADVANCE);
        assertEquals(3, lawnMower.position.getX());

        lawnMower.makeAMove(Instruction.RIGHT);
        lawnMower.makeAMove(Instruction.ADVANCE);
        assertEquals(6, lawnMower.position.getY());
    }

    @Test
    void givenLawnMower_whenTurnRight_thenReturnNewOrientation() {
        assertEquals(Orientation.NORTH, this.lawnMower.getOrientation());
        lawnMower.turn(-90);
        assertEquals(Orientation.EAST, this.lawnMower.getOrientation());
        lawnMower.turn(-90);
        assertEquals(Orientation.SOUTH, this.lawnMower.getOrientation());
        lawnMower.turn(-90);
        assertEquals(Orientation.WEST, this.lawnMower.getOrientation());
        lawnMower.turn(-90);
        assertEquals(Orientation.NORTH, this.lawnMower.getOrientation());
    }

    @Test
    void givenLawnMower_whenTurnLeft_thenReturnNewOrientation() {
        assertEquals(Orientation.NORTH, this.lawnMower.getOrientation());
        lawnMower.turn(90);
        assertEquals(Orientation.WEST, this.lawnMower.getOrientation());
        lawnMower.turn(90);
        assertEquals(Orientation.SOUTH, this.lawnMower.getOrientation());
        lawnMower.turn(90);
        assertEquals(Orientation.EAST, this.lawnMower.getOrientation());
        lawnMower.turn(90);
        assertEquals(Orientation.NORTH, this.lawnMower.getOrientation());
    }

}