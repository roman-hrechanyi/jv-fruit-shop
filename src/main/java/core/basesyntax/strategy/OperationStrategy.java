package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public interface OperationStrategy {
    void proceedOperation(FruitTransaction fruitTransaction);
}
