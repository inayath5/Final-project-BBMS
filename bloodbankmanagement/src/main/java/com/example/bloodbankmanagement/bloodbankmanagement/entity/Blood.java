package com.example.bloodbankmanagement.bloodbankmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name="blood")
public class Blood {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private  Integer id;
    private String type;


    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id", insertable = false,updatable = false)
    private Donor donor;


    public Blood(String type, Donor donor) {
        this.type = type;
        this.donor = donor;
    }

    public Blood() {
    }

    public Blood(String type) {
        this.type=type;
    }

    public Blood(Integer id, String type) {
        this.id=id;
        this.type=type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

	@Override
	public String toString() {
		return "Blood [id=" + id + ", type=" + type + ", donor=" + donor + "]";
	}

  
}