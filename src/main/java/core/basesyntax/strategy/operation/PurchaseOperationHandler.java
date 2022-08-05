package core.basesyntax.strategy.operation;

import core.basesyntax.service.FruitTransaction;

public class PurchaseOperationHandler implements OperationHandler {
    @Override
    public void doTransaction(FruitTransaction transaction) {
        subtractFromBalance(transaction);
    }
}