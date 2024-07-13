public class StringExample {
    public static void main(String[] args) {
        String s1 = "Bhagirath";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('a', 'z'));
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.lastIndexOf('e'));
        String s2 = "ViewSonic";
        System.out.println(s2);
        System.out.println(s1.trim() + s2.trim());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2)); // in this case unicode of each character is checked if unicode(ASCII) of
                                              // charater is greater then result is positive no if less then negative no
                                              // and equal then zero than
        System.out.println(s1.concat(s2));
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 8));
        System.out.println(s1.toString());
        int i = 100;
        System.out.println(s1.valueOf(i).length());
        //convert i into string that is 100 so length of 100 is 3 output
    }

}
