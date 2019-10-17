package com.example.factoryMethod;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class PraiseTwoFactory implements IMachineFacroty {

    @Override
    public IXiaoMing createXiaoMing() {
        return new PraiseTwo();
    }
}
