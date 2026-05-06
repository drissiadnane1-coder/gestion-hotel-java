package model;

public class Chambre {
    private int id;
    private String numero;
    private String type;
    private int etage;
    private double prixParNuit;
    private String statut;

    public Chambre() {
    }

    public Chambre(int id, String numero, String type, int etage, double prixParNuit, String statut) {
        this.id = id;
        this.numero = numero;
        this.type = type;
        this.etage = etage;
        this.prixParNuit = prixParNuit;
        this.statut = statut;
    }

    public Chambre(String numero, String type, int etage, double prixParNuit, String statut) {
        this.numero = numero;
        this.type = type;
        this.etage = etage;
        this.prixParNuit = prixParNuit;
        this.statut = statut;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getEtage() { return etage; }
    public void setEtage(int etage) { this.etage = etage; }

    public double getPrixParNuit() { return prixParNuit; }
    public void setPrixParNuit(double prixParNuit) { this.prixParNuit = prixParNuit; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}
