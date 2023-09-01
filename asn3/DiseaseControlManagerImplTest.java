package edu.disease.asn3;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class DiseaseControlManagerImplTest {

	static DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
	static UUID patientId = UUID.randomUUID();
	static UUID diseaseId = UUID.randomUUID();
	@Order(1)
	@Test
	void testDiseaseControlManagerImpl() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
	}
	@Order(2)
	@Test
	void testDiseaseControlManagerImpl1() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(-1, -1));
	}
	@Order(3)
	@Test
	void testDiseaseControlManagerImpl2() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(1, -1));	
	}
	@Order(4)
	@Test
	void testDiseaseControlManagerImpl3() {
		assertThrows(IllegalArgumentException.class, ()->new DiseaseControlManagerImpl(-1, 1));	
	}
	@Order(5)
	@Test
	void testAddDisease() {
		dcmi.addDisease("CORONA", true);
	}
	@Order(6)
	@Test
	void testAddDisease1() {
		dcmi.addDisease("HEART ATTACK", false);
	}
	@Order(7)
	@Test
	void testAddDisease2() {
		
		assertThrows(IllegalStateException.class,()-> dcmi.addDisease("FLU", true));
	}
	@Order(8)
	@Test
	void testGetDisease() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Disease disease=dcmi.addDisease("CORONA", true);
		UUID did = disease.getDiseaseId();
		Disease disease2=dcmi.getDisease(did);
		assertTrue(disease.equals(disease2));
	}
	@Order(9)
	@Test
	void testGetDisease1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addDisease("CORONA", true);
		dcmi.addDisease("CORONA", true);
		assertNull(dcmi.getDisease(UUID.randomUUID()));
		
	}
	@Order(10)
	@Test
	void testAddPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addPatient("Pra", "Shanth", 2, 2);
		dcmi.addPatient("Sree", "lash", 2, 2);
	}
	@Order(11)
	@Test
	void testAddPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		dcmi.addPatient("Pra", "Shanth", 2, 2);
		dcmi.addPatient("Sree", "lash", 2, 2);
		assertThrows(IllegalStateException.class, ()->dcmi.addPatient("Sree", "lash", 2, 2));
	}
	@Order(12)
	@Test
	void testGetPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID pid = p1.getPatientId();
		assertEquals(p1, dcmi.getPatient(pid));
	}
	@Order(13)
	@Test
	void testGetPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		assertNull(dcmi.getPatient(UUID.randomUUID()));
	}
	@Order(14)
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
	@Order(15)
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
	@Order(16)
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
	@Order(17)
	@Test
	void testAddExposuretoPatient() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		UUID p1id = p1.getPatientId();
		Exposure e = new Exposure(p1id);
		dcmi.addExposuretoPatient(p1id, e);
	}
	@Order(18)
	@Test
	void testAddExposuretoPatient1() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 2);
		Patient p1 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Patient p2 = dcmi.addPatient("Pra", "Shanth", 2, 2);
		Exposure e = new Exposure(UUID.randomUUID());
		assertThrows(IllegalArgumentException.class, ()->dcmi.addExposuretoPatient(UUID.randomUUID(), e));
	}
	
}
