package intecbrussel.enum1;

public enum Landen {
    USA(10),
    BELGIUM(1),
    BELARUS(2),
    BRAZIL(3),
    DENMARK(4),
    FINLAND(5),
    ICELAND(6),
    NETHERLANDS(7),
    SPAIN(8),
    SWEDEN(9);
    private Landen defaultCode;

    private int landenCode;

    Landen(int landenCode) {
        this.landenCode = landenCode;
        //System.out.println("Constructor is called " + this.toString());
    }

    public void defaultLanden() {
        System.out.println("The default landen is " + BELGIUM);
    }

    public int getLandenCodeCode() {
        return landenCode;
    }
}