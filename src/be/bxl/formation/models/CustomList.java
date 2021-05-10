package be.bxl.formation.models;

public class CustomList<TData> implements ICustomList<TData> {

    private final int NB_MAX_INTERNAL = 1000;

    private Object[] internalValues;
    private int sizeInterval;

    public CustomList() {
        this.internalValues = new Object[NB_MAX_INTERNAL];
        this.sizeInterval = 0;
    }

    @Override
    public TData get(int index) {
        if(index > sizeInterval)
            throw new RuntimeException("Boum! Ca a explosé :o");

        return (TData) this.internalValues[index];
    }

    @Override
    public void add(TData value) {
        if(sizeInterval + 1 > NB_MAX_INTERNAL)
            throw new RuntimeException("Boum! Ca a explosé :o");

        this.internalValues[sizeInterval] = value;
        sizeInterval++;
    }

    @Override
    public int size() {
        return this.sizeInterval;
    }

    @Override
    public void clear() {
        this.internalValues = new Object[NB_MAX_INTERNAL];
        this.sizeInterval = 0;
    }
}
