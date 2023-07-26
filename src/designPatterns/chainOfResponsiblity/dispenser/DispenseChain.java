package designPatterns.chainOfResponsiblity.dispenser;

import designPatterns.chainOfResponsiblity.model.Currency;

public interface DispenseChain {
    void setNextChain(DispenseChain chain);

    void dispense(Currency cur);
}
