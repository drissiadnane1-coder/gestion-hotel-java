package model;

import java.sql.Date;

public class Paiement {
    private int id;
    private int reservationId;
    private Date datePaiement;
    private double montant;
    private String modePaiement;

    public Paiement() {
    }

    public Paiement(int id, int reservationId, Date datePaiement, double montant, String modePaiement) {
        this.id = id;
        this.reservationId = reservationId;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.modePaiement = modePaiement;
    }

    public Paiement(int reservationId, Date datePaiement, double montant, String modePaiement) {
        this.reservationId = reservationId;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.modePaiement = modePaiement;
    }

    public int getId() { return id; }
    public int getReservationId() { return reservationId; }
    public Date getDatePaiement() { return datePaiement; }
    public double getMontant() { return montant; }
    public String getModePaiement() { return modePaiement; }

    public void setId(int id) { this.id = id; }
    public void setReservationId(int reservationId) { this.reservationId = reservationId; }
    public void setDatePaiement(Date datePaiement) { this.datePaiement = datePaiement; }
    public void setMontant(double montant) { this.montant = montant; }
    public void setModePaiement(String modePaiement) { this.modePaiement = modePaiement; }
}
