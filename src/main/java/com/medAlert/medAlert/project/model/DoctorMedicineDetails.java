package com.medAlert.medAlert.project.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "doctor_medicine_details")
public class DoctorMedicineDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;

    private String batchNumber;
    private LocalDate expiryDate;

    @Column(columnDefinition = "TEXT")
    private String note;
}
