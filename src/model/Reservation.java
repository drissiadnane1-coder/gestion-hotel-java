package model;

import java.sql.Date;

public class Reservation {
    private int id;
    private int clientId;
    private int chambreId;
    private Date dateDebut;
    private Date dateFin;
    private String statut;

    public Reservation() {}

    public Reservation(int id, int clientId, int chambreId, Date dateDebut, Date dateFin, String statut) {
        this.id = id;
        this.clientId = clientId;
        this.chambreId = chambreId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }

    public Reservation(int clientId, int chambreId, Date dateDebut, Date dateFin, String statut) {
        this.clientId = clientId;
        this.chambreId = chambreId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }

    public int getId() { return id; }
    public int getClientId() { return clientId; }
    public int getChambreId() { return chambreId; }
    public Date getDateDebut() { return dateDebut; }
    public Date getDateFin() { return dateFin; }
    public String getStatut() { return statut; }

    public void setId(int id) { this.id = id; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public void setChambreId(int chambreId) { this.chambreId = chambreId; }
    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }
    public void setDateFin(Date dateFin) { this.dateFin = dateFin; }
    public void setStatut(String statut) { this.statut = statut; }
}
