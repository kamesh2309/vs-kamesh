package edu.disease.asn4;

import static org.junit.jupiter.api.Assertions.*
;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Exposure;
import edu.disease.asn3.DiseaseControlManagerImpl;
import edu.disease.asn3.Patient;

class ContactTraceTest {

	static ContactTrace ct = new ContactTrace(new  DiseaseControlManagerImpl(2, 2));
	@Test
	void testContactTrace() {
		ContactTrace ct = new ContactTrace(new  DiseaseControlManagerImpl(2, 2));
	}

	@Test
	void testFindPatientZero() throws InterruptedException {
		UUID patientId1 = UUID.randomUUID(), patientId2 = UUID.randomUUID();
		
		LocalDateTime ldt1 = LocalDateTime.now();
		Thread.sleep(2000);
		LocalDateTime ldt2 = LocalDateTime.now();
		
		Exposure exposure1 = new Exposure(patientId1);
		exposure1.setDateTime(ldt1);
		exposure1.setExposureType("D");
		
		Exposure exposure2 = new Exposure(patientId2);
		exposure2.setDateTime(ldt2);
		exposure2.setExposureType("I");
		Exposure[] exposures = {exposure1, exposure2};
		
		Patient patient1 = new Patient(2, 2);
		patient1.setExposures(exposures);
		Patient patient2 = new Patient(2, 2);
		Patient[] patients = {patient1, patient2};
		
		
		ct.findPatientZero(patient1);
	}

}