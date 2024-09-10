package tp.demo.model;

public class Devise {
    private String code; //ex: "USD" ,"EUR"
    private String nom ; // ex: "Dollar" ou "Euro" ou ...
    private Double change; //taux de change (nbUnite pour 1 euro)

    //+get/set public

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    //+toString()

    @Override
    public String toString() {
        return "Devise{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", change=" + change +
                '}';
    }


    //+constructeur par défaut et avec paramètres

    public Devise(String code, String nom, Double change) {
        this.code = code;
        this.nom = nom;
        this.change = change;
    }

    public Devise() {
    }
}
