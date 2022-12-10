public class Main {
    public static void main(String[] args) {
//        String s = new String("Java");
//        String ss = new String("Java");
//
//        boolean b = s.equals(ss);
//
//        System.out.println(b);
//
//        Object obj = new Object();
//        Object obj2 = new Object();
//
//        boolean test = obj.equals(obj2);
//        System.out.println(test);
//
//        Object sObj = s;
//        Object ssObj = ss;
//
//        boolean ob = sObj.equals(ssObj); // burada stringin equals metodu objectin eqauls metodunu override edib!
//
//        System.out.println(ob);

        Bmw b =new Bmw();
        Object o = b;

        System.out.println(o);
        System.out.println(b);
    }
}