public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Hanif";
        stringArray[1] = "Faiz";
        stringArray[2] = "Hidayat";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = {
                "Hanif", "Faiz", "Hidayat"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Hanif", "Faiz"},
                {"Haikal", "Aziz"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
