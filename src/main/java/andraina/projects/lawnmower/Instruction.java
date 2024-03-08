package andraina.projects.lawnmower;

public enum Instruction {

    LEFT('G'),
    RIGHT('D'),
    ADVANCE('A');

    private final char value;

    Instruction(char instruction) {
        this.value = instruction;
    }
}
