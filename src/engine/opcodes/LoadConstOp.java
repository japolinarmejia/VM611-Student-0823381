package engine.opcodes;

import java.util.Stack;

import engine.StackFrame;

/**
 * Loads a constant onto the stack.
 */
public class LoadConstOp extends Opcode {
    private int value;

    public LoadConstOp(int value) {
        this.value = value;
    }

    @Override
    public void execute(Stack<StackFrame> callStack, Stack<Integer> opStack) {
        opStack.push(value);
    }

    @Override
    public String toString() {
        return "load_const " + value;
    }
}
