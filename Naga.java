public class Naga extends Musuh {

    public Naga() {
    super("Naga Gemoy", 500);
    }

@Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " menyemburkan nafas gemoy dari udara! Player -50 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + ": ROAARRR... SEMBURRR!");
    }
}
