package NestedClassLessons.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult(){
        int delimoe = 21;
        class Delenie{
//            private int delimoe;
            private int delitel;


//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe(){
                return delimoe / delitel;
            }

            public int getOstatok(){
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("delimoe = " + delimoe);
        System.out.println("delitel = " + delenie.getDelitel());
        System.out.println("chastnoe = " + delenie.getChastnoe());
        System.out.println("ostatok = " + delenie.getOstatok());
    }
}
