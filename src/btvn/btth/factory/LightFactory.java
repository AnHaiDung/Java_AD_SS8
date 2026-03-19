package btvn.btth.factory;

import java.util.Scanner;

public class LightFactory extends FactoryDevice{

    @Override
    public Device create() {
        return new LightDevice();
    }
}
