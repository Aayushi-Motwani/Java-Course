package Collections.Map.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMaps {
    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();

        imageCache.put("img1", new Image("Image 1"));
        imageCache.put("img2", new Image("Image 2"));
        // here the above created entries are weak references. so it may be cleared when waited for 5 or 10 secs.
        // if not cleared then we can call gc().
        // gc only collect keys not values
        // one major point is gc does not collect literals (string literals) which are stored in string pool 
        // which becomes strong reference for the lifetime i.e. java will store them even if they are not getting used.
        // and here our keys are strings which will not be garbage collected. so we have to make sure that we make non literal keys.
        System.gc();
        System.out.println(imageCache);
        SimulateApplicationRunning();
        System.out.println("Cache after running some entries may be cleared"+imageCache); //does not clears the map.

        // ==============================================================================================================

        // now to avoid this we need to add keys as Objects not as direct string literals.

        WeakHashMap<String,Image> imageCache1 = new WeakHashMap<>();
        String key1 = new String("img1");
        String key2 = new String("img2");

        imageCache.put(key1, new Image("Image 1"));
        imageCache.put(key2, new Image("Image 2"));

        System.out.println(imageCache1);

        key1 = null;
        key2 = null;
        // if dont want to use null explicitly then we can simply use weak references on keys and values
        // for e.g. imageCache.put(new String("img1"), new Image("Image 1"));
        // like this we dont require to use key1 = null

        System.gc();
        SimulateApplicationRunning();
        System.out.println("Cache after running some entries may be cleared"+imageCache1); //it works , data gets garbage collected

        // ===============================================================================================================

        // there is one more way we can do to let the garbage collected.
        // we can store the string Objects in a method and call this method in main. this works because those string Objects
        // having scope within the method and so that gc can collect it in main method.

     

    }

    public static void SimulateApplicationRunning(){
        try {
            System.out.println("simulating the application");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
    
}
