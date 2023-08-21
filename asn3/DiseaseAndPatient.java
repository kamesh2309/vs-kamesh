package edu.disease.asn3;

/**
 * This is class DiseaseAndPatient It has Arrays of disease & patients has a
 * fields
 * 
 * @author dell
 *
 */
public class DiseaseAndPatient {
	private Disease[] diseases;
	private Patient[] patients;

	/**
	 * This Method gives Arrays of Diseases
	 */
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * This Method is use to set Diseases
	 */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}

	/**
	 * This Method gives Arrays of Patient
	 */
	public Patient[] getPatients() {
		return patients;
	}

	/**
	 * This Method is use to set Patient
	 */
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

}
