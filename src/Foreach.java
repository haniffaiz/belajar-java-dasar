public class Foreach {
    public static void main(String[] args) {
        String[] names = {
                "Hanif", "Faiz", "Hidayat",
                "Haikal", "Aziz"
        };

//Sejak Java 5/6 ada perulangan Foreach

        for(var name: names){
            System.out.println(name);
        }
    }

}
