public class EnumDemo {
    public enum Days {
        //JAN(1), FEB(2), MAR(3);
    	Monday(1),Tuesday(2),Wednesday(3),Thrusday(4),Friday(5),Saturday(6),Sunday(7);

        private int value;

        private Days(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Days m : Days.values()) {
            System.out.println(m + " " + m.value);
        }
    }
}
