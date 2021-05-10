package be.bxl.formation.models;

public interface ICustomList<DataType> {


    DataType get(int index);
    int size();

    void add(DataType value);
//    void insert(int index, DataType value);

//    void remove(DataType value);
//    void removeAll(DataType value);
//    void removeAt(int index);

    void clear();


}
