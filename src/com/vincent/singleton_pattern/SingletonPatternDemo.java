package com.vincent.singleton_pattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        // Construct and get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
