package edu.disease.asn2;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class DiseaseControlManagerImplTest {

	static DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
	static UUID patientId = UUID.randomUUID();
	static UUID diseaseId = UUID.randomUUID();
	@Test
	void testDiseaseControlManagerImpl() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
	}
	@Test
	void testDiseaseControlManagerImpl1() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(-1, -1));
	}
	@Test
	void testDiseaseControlManagerImpl2() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(1, -1));	
	}
	@Test
	void testDiseaseControlManagerImpl3() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(-1, 1));	
	}
	
	@Test
	void testAddDisease() {
		dcmi.addDisease("CORONA", true);
	}
	@Test
	void testAddDisease1() {
		dcmi.addDisease("HEART ATTACK", false);
	}
	
	@Test
	void testAddDisease2() {
		
		assertThrows(IllegalStateException.class,()-> dcmi.addDisease("FLU", true));
	}

	@Test
	void testGetDisease() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Disease disease=dcmi.addDisease("CORONA", true);
		UUID did = disease.getDiseaseId();
		Disease disease2=dcmi.getDisease(did);
		assertTrue(disease.equals(disease2));
	}
	@Test
	void testGetDisease1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addDisease("CORONA", true);
		dcmi.addDisease("CORONA", true);
		assertNull(dcmi.getDisease(UUID.randomUUID()));
		
	}

	@Test
	void testAddPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addPatient("Pra", "Shanth", 2, 2);
		dcmi.addPatient("Sree", "lash", 2, 2);
	}
	@Test
	void testAddPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addPatient("Pra", "Shanth", 2, 2);
		dcmi.addPatient("Sree", "lash", 2, 2);
		assertThrows(IllegalStateException.class, ()->dcmi.addPatient("Sree", "lash", 2, 2));
	}

	@Test
	void testGetPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID pid = p1.getPatientId();
		assertEquals(p1, dcmi.getPatient(pid));
	}
	@Test
	void testGetPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		assertNull(dcmi.getPatient(UUID.randomUUID()));
	}

	@Test
	void testAddDiseasetoPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p1id = p1.getPatientId();
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p2id = p2.getPatientId();

		Disease disease=dcmi.addDisease("CORONA", true);
		UUID did = disease.getDiseaseId();
		Disease disease2=dcmi.getDisease(did);
		
		dcmi.addDiseasetoPatient(p1id,did);
	}
	@Test
	void testAddDiseasetoPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p1id = p1.getPatientId();
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p2id = p2.getPatientId();
		
		Disease disease=dcmi.addDisease("CORONA", true);
		UUID did = disease.getDiseaseId();
		Disease disease2=dcmi.getDisease(did);

		
		assertThrows(IllegalArgumentException.class, ()->dcmi.addDiseasetoPatient(UUID.randomUUID(),did));
		
	}
	@Test
	void testAddDiseasetoPatient2() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p1id = p1.getPatientId();
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p2id = p2.getPatientId();
		
		Disease d1 = dcmi.addDisease("CORONA", true);
		
		Disease d2 = dcmi.addDisease("CORONA", true);
		
		assertThrows(IllegalArgumentException.class, ()->dcmi.addDiseasetoPatient(p1id, UUID.randomUUID()));
		
	}

	@Test
	void testAddExposuretoPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p1id = p1.getPatientId();
		Exposure e = new Exposure(p1id);
		dcmi.addExposuretoPatient(p1id, e);
	}
	@Test
	void testAddExposuretoPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Exposure e = new Exposure(UUID.randomUUID());
		assertThrows(IllegalArgumentException.class, ()->dcmi.addExposuretoPatient(UUID.randomUUID(), e));
	}

}
