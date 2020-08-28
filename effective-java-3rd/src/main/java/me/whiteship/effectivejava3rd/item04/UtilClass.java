package me.whiteship.effectivejava3rd.item04;

public class UtilClass {

    public static String getName() {
        return "keesun";
    }

    static class AnotherClass extends UtilClass {
        private AnotherClass() {
            // 유틸 클래스라 인스턴스를 만들지 못하게 막았습니다.
            throw new AssertionError();
        }


        public static String getName() {
            return "dhshin";
        }
    }

    public static void main(String[] args) {
        System.out.println(UtilClass.getName());
//        AnotherClass anotherClass = new AnotherClass();
        System.out.println(AnotherClass.getName());
    }

}
