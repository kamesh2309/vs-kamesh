package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class ExposureTest {

	static LocalDateTime ldt = LocalDateTime.now();
	static UUID random = UUID.randomUUID();
	static Exposure exposure = new Exposure(random);

	@Test
	void testHashCode() {
		assertNotNull(exposure.hashCode());
	}

	@Order(1)
	@Test
	void testHashCode2() {
		assertNotNull(exposure.hashCode());
	}

	@Order(2)
	@Test
	void testExposureUUID() {
		assertNotNull(exposure);
	}

	

	@Order(4)
	@Test
	void testGetPatientId() {
		UUID r = exposure.getPatientId();
		assertEquals(random, r);
	}

	@Order(5)
	@Test
	void testSetDateTime() {
		exposure.setDateTime(ldt);
	}

	@Order(6)
	@Test
	void testGetDateTime() {
		LocalDateTime ldt1 = exposure.getDateTime();
		assertEquals(ldt, ldt1);
	}

	@Order(7)
	@Test
	void testSetExposureType() {
		exposure.setExposureType("D");
	}

	@Order(8)
	@Test
	void testGetExposureType() {
		String infectious = exposure.getExposureType();
		assertEquals("D", infectious);
	}

	@Order(9)
	@Test
	void testSetExposureType1() {
		exposure.setExposureType("I");
	}

	@Order(10)
	@Test
	void testGetExposureType1() {
		String infectious = exposure.getExposureType();
		assertEquals("I", infectious);
	}

	@Order(11)
	@Test
	void testSetExposureType2() {
		assertThrows(IllegalArgumentException.class, () -> exposure.setExposureType("G"));
	}

	@Order(12)
	@Test
	void testSetExposureType3() {
		assertDoesNotThrow(() -> exposure.setExposureType("D"));
	}

	@Order(13)
	@Test
	void testEqualsObject() {
		assertTrue(exposure.equals(exposure));
	}

	@Order(14)
	@Test
	void testEqualsObject1() {
		assertFalse(exposure.equals(null));
	}

	@Order(15)
	@Test
	void testEqualsObject2() {
		assertFalse(exposure.equals(new String()));
	}

	@Order(16)
	@Test
	void testEqualsObject3() {
		Exposure e1 = new Exposure(UUID.randomUUID());
		Exposure e2 = new Exposure(UUID.randomUUID());
		e2.setDateTime(LocalDateTime.now());
		assertFalse(e1.equals(e2));
	}

	@Order(17)
	@Test
	void testEqualsObject4() {
		LocalDateTime ldt = LocalDateTime.now();
		Exposure e1 = new Exposure(UUID.randomUUID());
		Exposure e2 = new Exposure(UUID.randomUUID());
		e1.setDateTime(ldt);
		e2.setDateTime(ldt);
		assertFalse(e1.equals(e2));
	}

	@Order(18)
	@Test
	void testEqualsObject5() throws InterruptedException {
		Exposure e1 = new Exposure(UUID.randomUUID());
		Exposure e2 = new Exposure(UUID.randomUUID());
		e1.setDateTime(LocalDateTime.now());
		Thread.sleep(1000);
		e2.setDateTime(LocalDateTime.now());
		assertFalse(e1.equals(e2));
	}

	@Order(19)
	@Test
	void testEqualsObject6() {
		Exposure e1 = new Exposure(null);
		Exposure e2 = new Exposure(UUID.randomUUID());
		assertFalse(e1.equals(e2));
	}

	@Order(20)
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

	@Order(21)
	@Test
	void testToString() {
		assertNotNull(exposure.toString());
	}

}