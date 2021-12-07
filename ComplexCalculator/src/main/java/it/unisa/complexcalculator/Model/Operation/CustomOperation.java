package it.unisa.complexcalculator.Model.Operation;

import java.util.ArrayDeque;

public class CustomOperation implements Operation{
    private ArrayDeque<Operation> ops;

    public CustomOperation(ArrayDeque<Operation> ops) {
        this.ops = ops;
    }
    
    @Override
    public void execute() {
        ops.forEach(op -> {
            op.execute();
        });
    }
}