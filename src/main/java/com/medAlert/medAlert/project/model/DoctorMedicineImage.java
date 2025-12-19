package com.medAlert.medAlert.project.model;


import jakarta.persistence.*;

@Entity
@Table(name = "doctor_medicine_images")
public class DoctorMedicineImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;
}
