package edu.disease.asn6;

import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Disease;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.NonInfectiousDisease;

class DiseaseFileRepositoryTest {
 
	static DiseaseFileRepository dfr = new DiseaseFileRepository();
	@Test
	void testInit() throws Exception {
		dfr.init("D:\\DemoTest6");
	}
	@Test
	void testInit1() throws Exception {
		assertThrows(IllegalArgumentException.class, ()->dfr.init(null));
	}
	@Test
	void testSave() throws Exception  {
		List<Disease> diseases = Arrays.asList(new InfectiousDisease(), new NonInfectiousDisease());
		List<Patient> patients = Arrays.asList(new Patient(), new Patient());
		dfr.save(diseases, patients);
	}


}
