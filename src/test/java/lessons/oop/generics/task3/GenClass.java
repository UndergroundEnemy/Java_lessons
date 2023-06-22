package lessons.oop.generics.task3;

public class GenClass<T> {
    private T[] arr;

    @SafeVarargs
    public GenClass(T... types){
        arr=types;
    }

    public T getValue(int i){
        return arr[i];
    }
}
