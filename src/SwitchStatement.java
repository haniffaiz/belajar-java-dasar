public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

        switch (nilai){
            case "A":
                System.out.println("Wow,anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
            case "D":
                System.out.println("Anda tidak lulus");
            default:
            System.out.println("Waduh");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow,anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default ->{
                System.out.println("Waduh");
            }
        }

        switch (nilai){
            case "A" -> ucapan = "Wow,anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default ->{
                ucapan = "Waduh";
            }
        }

        System.out.println(ucapan);
    }
}
