public class bitWiseCoord {
    //Binär int börjar med 0b
    private short coordinate = 0b010100101011010;
    private short key = 0b0000000011111111;

    public bitWiseCoord(int x, int y) {
        x = coordinate&key;
        y = ((coordinate&65535)>>>8);
    }

    public void setHigh(int x) {

    }

    public void setLow(int y) {

    }

    public int getHigh() {
        return 1;
    }

    public int getLow() {
        return 1;
    }

    public String toString() {
        return "";
    }

    public static void main(String[] args) {
        short xy = (short)0b1111111111111111;
        short ja = (short)0b0000000011111111;
        short shift1 = (short)(xy&ja);
        System.out.println(shift1 + " " + Integer.toBinaryString(shift1));//Integer.parseInt(String.valueOf(shift1))));
        short shift2 = (short)((xy&65535)>>>8);
        System.out.println(shift2 + " " + Integer.toBinaryString(shift2));//Integer.parseInt(String.valueOf(shift2))));
    }
}
