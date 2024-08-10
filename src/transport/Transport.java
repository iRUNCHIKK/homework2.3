package transport;

import service.Serviceable;

public abstract class Transport implements Serviceable {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем колеса " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}