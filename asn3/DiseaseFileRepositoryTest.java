package edu.disease.asn3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DiseaseFileRepositoryTest {

	static DiseaseFileRepository dfr = new DiseaseFileRepository();
	@Test
	void testInit() throws Exception {
		dfr.init("D:\\DemoTest3");
	}
	@Test
	void testInit1() throws Exception {
		assertThrows(IllegalArgumentException.class, ()->dfr.init(null));
	}
	@Test
	void testSave() throws Exception  {
		Disease[] diseases = {new InfectiousDisease(), new NonInfectiousDisease()};
		Patient[] patients = {new Patient(2, 2), new Patient(1, 1)};
		dfr.save(diseases, patients);
	}

}