package edu.disease.asn4;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;

public class ContactTrace {

	Patient[] patient;
	
	Exposure earlyExposure;
	PatientZero pZero;
	
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.patient=diseaseControlManager.getPatients();
	}
	
	public PatientZero findPatientZero(Patient patient) {
		
		for(Exposure e : patient.getExposures()) {
			if(e.getExposureType().equalsIgnoreCase("D")) {
				if(earlyExposure == null || e.getDateTime().isBefore(earlyExposure.getDateTime())) {
					earlyExposure = e;
				}
			}
		}
		if(earlyExposure!=null) {
			for(Patient p1:this.patient) {
				for(Exposure e: p1.getExposures()) {
					if(e.getExposureType().equalsIgnoreCase("D")) {
						if(e.getDateTime().isBefore(earlyExposure.getDateTime())) {
							earlyExposure=e;
							pZero.setPatient(p1);
							pZero.setExposureDateTime(e.getDateTime());
							pZero.setExposed(true);
							return findPatientZero(p1);
						}
					}
				}
			}
		}
		return pZero;
	}
}