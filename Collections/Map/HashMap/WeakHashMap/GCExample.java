
package Collections.Map.HashMap.WeakHashMap;

import java.lang.ref.WeakReference;

public class GCExample {
    public static void main(String[] args) {

        Phone obj = new Phone("Apple","16 pro");
        // here this above line is termed as strong reference . 
        // in strong reference garbage Collection is not done until it starts pointing to null. No GC() is used

        System.out.println(obj);
        // Phone [brand=Apple, model=16 pro] will be printed because obj is referring/pointing to data directly

        obj = null;
        // now the obj is pointing to null that means no one is pointing to Phone [brand=Apple, model=16 pro]
        // so that will be removed or cleared by  jvm automatically . no need to call System.GC();

        System.out.println(obj);
        // now the output will be null as the memory is cleared and also obj is pointing to null.

        // ================================================================================================

        // WeakReference is not used much but only for caching in code.

        WeakReference<Phone> obj1 = new WeakReference<>(new Phone("nokia", "510"));
        // this is called weak reference.
        // here the WeakReference<> is a class provided by java to tell the jvm that this is not strong reference.
        // so jvm thinks it can remove the unused weak references.

        System.out.println(obj1.get());

        System.gc();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }

        System.out.println(obj1.get()); //it gets printed because jvm wished. 
        // if we use System.GC() to tell the jvm to clear this, it won't print.
        // the above statement prints after 10 secs . 

    }
    
}

class Phone {
    String brand;
    String model;
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + "]";
    }
    

    
    
}
