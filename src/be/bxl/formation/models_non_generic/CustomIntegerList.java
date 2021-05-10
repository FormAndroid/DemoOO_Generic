package be.bxl.formation.models_non_generic;

public class CustomIntegerList implements ICustomIntegerList {

    private final int NB_MAX_INTERNAL = 1000;

    private int[] internalValues;
    private int sizeInterval;

    public CustomIntegerList() {
        this.internalValues = new int[NB_MAX_INTERNAL];
        this.sizeInterval = 0;
    }

    @Override
    public int get(int index) {
        if(index > sizeInterval)
            throw new RuntimeException("Boum! Ca a explosé :o");

        return this.internalValues[index];
    }

    @Override
    public void add(int value) {
        if(sizeInterval + 1 > NB_MAX_INTERNAL)
            throw new RuntimeException("Boum! Ca a explosé :o");

        this.internalValues[sizeInterval] = value;
        sizeInterval++;
    }

    @Override
    public void clear() {
        this.internalValues = new int[NB_MAX_INTERNAL];
        this.sizeInterval = 0;
    }

    @Override
    public int size() {
        return sizeInterval;
    }
}
