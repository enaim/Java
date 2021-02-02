package practice;

class GenericsClass<T>{
    private T data;

    public GenericsClass(T val) {
        data = val;
    }
    public void getData(){
        System.out.println(data);
    }
    
}

public class GenericsClassExample {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        intObj.getData();
        
        GenericsClass<String> stringObj = new GenericsClass<>("Okay!");
        stringObj.getData();
    }
}