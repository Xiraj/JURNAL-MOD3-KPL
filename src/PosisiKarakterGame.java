public class PosisiKarakterGame {
    private String state = "Masukkan perintah";
    public void gerak(String command) { //1302204057 % 3 == 0
        switch (command) {
            case "TombolS":
                this.state = "tombol arah bawah ditekan";
                break;
            case "TombolW":
                this.state = "tombol arah atas ditekan";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}