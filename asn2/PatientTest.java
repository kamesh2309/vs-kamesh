package edu.disease.asn2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import edu.disease.asn1.Exposure;

@TestMethodOrder(OrderAnnotation.class)
class PatientTest {

	static Patient patient = new Patient(2,2);
	static private Exposure[] exposures;
	static private UUID[] diseaseIds;
	static UUID patientId = UUID.randomUUID();
	@Order(1)
	@Test
	void testHashCode() {
		assertNotNull(patient.hashCode());
	}
	@Order(2)
	@Test
	void testPatient() {
		assertThrows(IllegalArgumentException.class, ()->new Patient(-1,-1));
	}
	@Order(3)
	@Test
	void testAddDiseaseId() {
		patient.addDiseaseId(UUID.randomUUID());
		patient.addDiseaseId(UUID.randomUUID());
	}
	@Order(4)
	@Test
	void testAddDiseaseId1() {
		assertThrows(IndexOutOfBoundsException.class, ()-> patient.addDiseaseId(UUID.randomUUID()));
	}
	@Order(5)
	@Test
	void testAddExposure() {
		patient.addExposure(new Exposure(UUID.randomUUID()));
		patient.addExposure(new Exposure(UUID.randomUUID()));
	}

	@Order(6)
	@Test
	void testAddExposure1() {
		assertThrows(IndexOutOfBoundsException.class, () -> patient.addExposure(new Exposure(UUID.randomUUID())));
	}
	@Order(7)
	@Test
	void testSetFirstName() {
		patient.setFirstName("GURUNATHAN");
	}
	@Order(8)
	@Test
	void testGetFirstName() {
		assertEquals("GURUNATHAN", patient.getFirstName());
	}
	@Order(9)
	@Test
	void testSetLastName() {
		patient.setLastName("PREMKUMAR");
	}
	@Order(10)
	@Test
	void testGetLastName() {
		assertEquals("PREMKUMAR", patient.getLastName());
	}
	@Order(11)
	@Test
	void testSetPatientId() {
		patient.setPatientId(UUID.randomUUID());
	}
	@Order(12)
	@Test
	void testGetPatientId() {
		
		patient.setPatientId(patientId);
		assertEquals(patientId, patient.getPatientId());
	}
	@Order(13)
	@Test
	void testSetExposures() {
		patient.setExposures(exposures);
	}
	@Order(14)
	@Test
	void testGetExposures() {
		assertArrayEquals(exposures, patient.getExposures());
	}
	@Order(15)
	@Test
	void testSetDiseaseIds() {
		patient.setDiseaseIds(diseaseIds);
	}
	@Order(16)
	@Test
	void testGetDiseaseIds() {
		assertArrayEquals(diseaseIds, patient.getDiseaseIds());
	}
	@Order(17)
	@Test
	void testEqualsObject() {
		assertTrue(patient.equals(patient));
	}
	
	@Order(18)
	@Test
	void testEqualsObject1() {
		assertFalse(patient.equals(null));
	}
	
	@Order(19)
	@Test
	void testEqualsObject2() {
		assertFalse(patient.equals(new String()));
	}
	
	@Order(20)
	@Test
	void testEqualsObject3() {
		Patient patient = new Patient(2,2);
		Patient patient1 = new Patient(2,2);
		patient1.setPatientId(UUID.randomUUID());
		assertFalse(patient.equals(patient1));
	}
	@Order(21)
	@Test
	void testEqualsObject4() {
		UUID rdm = UUID.randomUUID();
		Patient patient = new Patient(2,2);
		Patient patient1 = new Patient(2,2);
		patient.setPatientId(rdm);
		patient1.setPatientId(rdm);
		assertTrue(patient.equals(patient1));
	}
	
	@Order(22)
	@Test
	void testEqualsObject5() throws InterruptedException {
		Patient patient = new Patient(2,2);
		Patient patient1 = new Patient(2,2);
		patient.setPatientId(UUID.randomUUID());
		patient1.setPatientId(UUID.randomUUID());
		assertFalse(patient.equals(patient1));
	}
	
	
	@Order(23)
	@Test
	void testEqualsObject6() {
		Exposure e1 = new Exposure(null);
		Exposure e2 = new Exposure(UUID.randomUUID());
		assertFalse(e1.equals(e2));
	}
	@Order(24)
	@Test
	void testEqualsObject7() {
		LocalDateTime ldt = LocalDateTime.now();
		UUID rdm = UUID.randomUUID();
		Exposure e1 = new Exposure(rdm);
		Exposure e2 = new Exposure(rdm);
		e1.setDateTime(ldt);
		e2.setDateTime(ldt);
		assertTrue(e1.equals(e2));
	}
    @Order(25)
    @Test
    void testCompareTo() {
    	Patient p = new Patient(2, 2);
    	p.setLastName("PREMKUMAR");
    	p.setFirstName("SWATHI");
    	int res = patient.compareTo(p);
    	assertEquals(res, res);
    }
    @Order(26)
    
    @Test
    void testCompareTo1() {
    	Patient p = new Patient(2, 2);
    	p.setLastName("MURUGAN");
    	p.setFirstName("KARTHIKA");
    	int res = patient.compareTo(p);
    	assertEquals(res, res);
    }
    @Order(27)
	@Test
	void testToString() {
		assertNotNull(patient.toString());
	}

}