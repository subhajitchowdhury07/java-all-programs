//Try super class in java
class aa{
    int y=10;
}
class bb extends aa{
    int y =20;
    void show() {
        System.out.println(y);
        System.out.println(super.y);
    
       
    }
}
public class practice_1
{
    public static void main(String[] args) {
        bb obj =new bb();
        obj.show();
        



    }
}
