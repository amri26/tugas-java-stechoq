public class Main {
    public static void main(String[] args) {
        Institut itb = new Institut("ITB", "Bandung", 1770, "Ganesha");
        SekolahTinggi stan = new SekolahTinggi("STAN", "Jember", 1880, "Keuangan");

        itb.diesnatalis();
        itb.setYayasan("Non Profit Ganesha");
        System.out.println(itb.getYayasan());

        stan.diesnatalis();
        stan.setKementerian("Menteri Keuangan");
        System.out.println(stan.getKementerian());
    }
}