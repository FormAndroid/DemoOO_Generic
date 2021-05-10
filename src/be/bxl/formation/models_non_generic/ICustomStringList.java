package be.bxl.formation.models_non_generic;

public interface ICustomStringList {

    String get(int index);
    int size();

    void add(String value);
//    void insert(int index, String value);

//    void remove(String value);
//    void removeAll(String value);
//    void removeAt(int index);

    void clear();

}
