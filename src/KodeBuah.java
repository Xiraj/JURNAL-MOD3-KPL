public class KodeBuah {
    private static String Buah(String namaBuah){
        switch (namaBuah) {
            case "Apel":
                return "A00";
            case "Aprikot":
                return "B00";
            case "Alpukat":
                return "C00";
            case "Pisang":
                return "D00";
            case "Paprika":
                return "E00";
            case "Blackberry":
                return "F00";
            case "Ceri":
                return "H00";
            case "Kelapa":
                return "I00";
            case "Jagung":
                return "J00";
            case "Kurma":
                return "K00";
            case "Durian":
                return "L00";
            case "Anggur":
                return "M00";
            case "Melon":
                return "N00";
            case "Semangka":
                return "O00";
            default:
                return "Kode Buah Tidak Ditemukan";
        }
    }
    public static String getKodeBuah(String name) {
        return Buah(name);
    }
}