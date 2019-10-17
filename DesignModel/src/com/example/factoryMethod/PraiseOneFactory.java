package com.example.factoryMethod;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class PraiseOneFactory implements IMachineFacroty {

    @Override
    public IXiaoMing createXiaoMing() {
        return new PraiseOne();
    }
}
