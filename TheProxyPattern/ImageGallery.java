package TheProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery {
    public static void main(String[] args) {
        List<DisplayObject> images = new ArrayList<>();
        
        images.add(new ImageProxy("vacation_01.jpg"));
        images.add(new ImageProxy("vacation_02.jpg"));
        images.add(new ImageProxy("vacation_03.jpg"));

        System.out.println("Gallery initialized. No images loaded yet.");
        System.out.println("-------------------------------------------");

        images.get(0).display(); 

        images.get(0).display(); 
    }
}
