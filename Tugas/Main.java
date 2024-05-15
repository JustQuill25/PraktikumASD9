package Tugas;

public class Main {
        public static void main(String[] args) {

                PermainanScavengerHunt permainan = new PermainanScavengerHunt(300);

                permainan.tambahTitik("Aku akan memainkan teka-teki jawa, Ayam hutan di balik jadi?", "Nanas", "Hutan",
                                "Temukan Jawaban nya dengan analisa mu.");
                permainan.tambahTitik("Apa yang bisa ditemukan di dalam kulkas, tapi tidak bisa dimakan?", "lampu",
                                "Dapur",
                                "Apa hayoo.");
                permainan.tambahTitik(
                                "Aku adalah yang pertama kali dinyalakan dan yang terakhir dimatikan, siapakah aku?",
                                "lilin", "Ruang Tidur", "Biasanya digunakan pas butuh aja(Mati Lampu)");

                System.out.println("=============================================");
                System.out.println("Selamat datang di permainan scavenger hunt! ||");
                System.out.println("=============================================");
                permainan.mulaiPermainan();
        }
}