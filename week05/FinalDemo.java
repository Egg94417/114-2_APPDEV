package week05;

public class FinalDemo {

    // TODO 1: 宣告 final 變數
    static final int MAX_DEPTH = 11034;  // 馬里亞納海溝最深處

    // TODO 2: Ship 類別
    static class Ship {
        protected String name;

        public Ship(String name) {
            this.name = name;
        }

        // final 方法（不能被覆寫）
        public final String type() {
            return "船舶";
        }

        public String sail() {
            return name + " 正在航行";
        }
    }

    // TODO 3: FishingBoat 繼承 Ship
    static class FishingBoat extends Ship {

        public FishingBoat(String name) {
            super(name);
        }

        // 覆寫 sail()
        @Override
        public String sail() {
            return name + " 正在拖網捕魚";
        }

    }

    public static void main(String[] args) {
        System.out.println("馬里亞納海溝最深：" + MAX_DEPTH + " 公尺");


        Ship s = new Ship("遠洋號");
        FishingBoat f = new FishingBoat("海豐號");

        System.out.println(s.type() + "：" + s.sail());
        System.out.println(f.type() + "：" + f.sail());

        // 多型
        Ship s2 = new FishingBoat("福星號");
        System.out.println(s2.type() + "：" + s2.sail());
    }
}
