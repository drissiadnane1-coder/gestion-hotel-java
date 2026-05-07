package model;

import java.sql.Date;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private int clientId;
    private int chambreId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;

    public Reservation() {}

    public Reservation(int id, int clientId, int chambreId, LocalDate dateDebut, LocalDate dateFin, String statut) {
        this.id = id;
        this.clientId = clientId;
        this.chambreId = chambreId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }

    public Reservation(int clientId, int chambreId, LocalDate dateDebut2, LocalDate dateFin2, String statut) {
        this.clientId = clientId;
        this.chambreId = chambreId;
        this.dateDebut = dateDebut2;
        this.dateFin = dateFin2;
        this.statut = statut;
    }

    public int getId() { return id; }
    public int getClientId() { return clientId; }
    public int getChambreId() { return chambreId; }
    public LocalDate getDateDebut() { return dateDebut; }
    public LocalDate getDateFin() { return dateFin; }
    public String getStatut() { return statut; }

    public void setId(int id) { this.id = id; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public void setChambreId(int chambreId) { this.chambreId = chambreId; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }
    public void setStatut(String statut) { this.statut = statut; }
}
