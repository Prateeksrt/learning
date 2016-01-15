package com.medical.Factory;

import com.medical.Prescription;

public class PrescriptionFactory {

    public Prescription makePrescription(){
        return new Prescription();
    }
}
