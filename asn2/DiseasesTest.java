package edu.disease.asn2;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(OrderAnnotation.class)
public class DiseasesTest {

	static Disease disease = new InfectiousDisease();
	static UUID diseaseId= UUID.randomUUID();
	static String name = "CORONA";

	@Order(1)
	@Test
	void testHashCode() {
		assertNotNull(disease.hashCode());
	}

	@Order(2)
	@Test
	void testSetDiseaseId() {
		disease.setDiseaseId(diseaseId);
	}
	
	@Order(3)
	@Test
	void testGetDiseaseId() {
		assertEquals(diseaseId, disease.getDiseaseId());
	}

	@Order(4)
	@Test
	void testSetName() {
		disease.setName(name);
	}

	@Order(5)
	@Test
	void testGetName() {
		assertEquals(name, disease.getName());
	}

	@Order(6)
	@Test
	void testEqualsObject() {
		assertTrue(disease.equals(disease));
	}

	@Order(7)
	@Test
	void testEqualsObject1() {
		assertFalse(disease.equals(null));
	}
	@Order(8)
	@Test
	void testEqualsObject2() {
		assertFalse(disease.equals(new String()));
	}
	@Order(9)
	@Test
	void testEqualsObject3() {
		Disease disease1 = new InfectiousDisease();
		disease1.setDiseaseId(null);
		Disease disease2 = new InfectiousDisease();
		disease2.setDiseaseId(UUID.randomUUID());
		assertFalse(disease1.equals(disease2));
	}
	@Order(10)
	@Test
	void testEqualsObject4() {
		Disease disease1 = new InfectiousDisease();
		disease1.setDiseaseId(UUID.randomUUID());
		Disease disease2 = new InfectiousDisease();
		disease2.setDiseaseId(UUID.randomUUID());
		assertFalse(disease1.equals(disease2));
	}
	@Order(11)
	@Test
	void testEqualsObject5() {
		UUID diseaseId = UUID.randomUUID();
		Disease disease1 = new InfectiousDisease();
		disease1.setDiseaseId(diseaseId);
		Disease disease2 = new InfectiousDisease();
		disease2.setDiseaseId(diseaseId);
		assertTrue(disease1.equals(disease2));
	}
	@Order(12)
	@Test
	void testEqualsObject6() {
		Disease disease1 = new InfectiousDisease();
		disease1.setDiseaseId(null);
		Disease disease2 = new InfectiousDisease();
		disease2.setDiseaseId(diseaseId);
		assertTrue(disease1.equals(disease2));
	}
	@Order(13)
	@Test
	void testToString() {
		assertNotNull(disease.toString());
	}
	@Order(14)
	@Test
	void testHashCode2() {
		UUID id = UUID.randomUUID();
		Disease disease = new InfectiousDisease();
		disease.setDiseaseId(null);
		int expected = 31;
		assertEquals(expected, disease.hashCode());
		
	}
	@Order(15)
	@Test
	void testHashCode3() {
		UUID id = UUID.randomUUID();
		Disease disease = new InfectiousDisease();
		disease.setDiseaseId(id);
		int expected = 31;
		assertEquals(expected, disease.hashCode());
		
	}

}