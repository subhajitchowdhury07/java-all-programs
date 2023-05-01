public class practice_copycon {
     int a;
     String s;
    practice_copycon(){
        a=50;
        s="alpha";
        System.out.println(a+" "+ s);
    }
    practice_copycon(practice_copycon ref){
        a=ref.a;
        s=ref.s;
        System.out.println(a+" "+ s);
    }
    public static void main(String[] args) {
        practice_copycon obj=new practice_copycon();
        practice_copycon obj2=new practice_copycon(obj);
    }

    
    
}

    
