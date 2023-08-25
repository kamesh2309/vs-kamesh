package edu.disease.asn6;


import java.util.List;

import edu.disease.asn3.Disease;

/**
 * This is class DiseaseAndPatient It has Arrays of disease & patients has a
 * fields
 * 
 * @author dell
 *
 */
public class DiseaseAndPatient {
	private List<Disease> diseases;
	private List<Patient> patients;

	/**
	 * This Method gives Arrays of Diseases
	 */
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * This Method is use to set Diseases
	 */
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	/**
	 * This Method gives Arrays of Patient
	 */
	public List<Patient> getPatients() {
		return patients;
	}

	/**
	 * This Method is use to set Patient
	 */
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

}
