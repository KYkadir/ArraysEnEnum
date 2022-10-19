package intecbrussel.enum1;

public class Vakantie {
    Landen landen;
    public Vakantie(Landen landen) {
        this.landen = landen;
    }

    public Vakantie() {

    }



    public void planVakantie(Landen landen){
        switch(landen) {
            case BELGIUM:
                System.out.println("Mijn vakantie plan in Belgium ");
                break;
            case BELARUS:
                System.out.println("Mijn vakantie plan in Belarus ");
                break;
            case BRAZIL:
                System.out.println("Mijn vakantie plan in Brazil");
                break;
            case DENMARK:
                System.out.println("Mijn vakantie plan in Denmark");
                break;
            case FINLAND:
                System.out.println("Mijn vakantie plan in Finland");
                break;
            case ICELAND:
                System.out.println("Mijn vakantie plan in Iceland");
                break;
            case NETHERLANDS:
                System.out.println("Mijn vakantie plan in Netherlands");
                break;
            case SPAIN:
                System.out.println("Mijn vakantie plan in Spain");
                break;
            case SWEDEN:
                System.out.println("Mijn vakantie plan in Sweden");
                break;
            case USA:
                System.out.println("Mijn vakantie plan in Usa");
                break;
            default:
                System.out.println("Ik weet het niet welke vakantie plan? Maar ik ga naar USA");
                break;
        }
    }



}
