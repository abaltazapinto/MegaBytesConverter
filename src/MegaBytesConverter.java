public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKB + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(452);
        printMegaBytesAndKiloBytes(-452);
    }
}