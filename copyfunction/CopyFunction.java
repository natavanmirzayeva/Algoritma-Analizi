

package copyfunction;

import java.util.ArrayList;



public class CopyFunction {

    
    
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        
        
        ArrayList<Integer> liste = new ArrayList<>();
        ArrayList<Integer> liste1 = new ArrayList<>();
        mc1.ekle(5); //ekle fonksiyonunu ne kadar eklersek karmaşıklık o kadar çok artar yani karmaşıklı O(n) dir
        mc1.ekle(6);
        mc1.ekle(7);
        for (int i = 0; i < mc1.myList.size(); i++) {
            System.out.println("birinci nesnenin listesi:"+mc1.myList.get(i));
        }
        
        
        mc2 = mc1.clone(); //yazılan clone fonksiyonunun karmaşıklığı best casede O(n) ile worst casede O'dir
        
        for (int i = 0; i < mc2.myList.size(); i++) {
            System.out.println("ikinci nesnenin listesi:"+mc2.myList.get(i));
        }
        
        
        
    }
    
}
