package edu.disease.asn3;

/**
 * This is class called DiseaseAndPatient. It has Disease[] diseases, Patient[]
 * patients as its fields.
 * 
 * @author DELL
 *
 */
public class DiseaseAndPatient {
	private Disease[] diseases;
	private Patient[] patients;

	/**
	 * This method gives array of diseases.
	 * 
	 * @return
	 */
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * This method is used to set the array of diseases.
	 * 
	 * @param diseases
	 */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}

	/**
	 * This method gives array of patients.
	 * 
	 * @return
	 */
	public Patient[] getPatients() {
		return patients;
	}

	/**
	 * This method is used to set the array of patients.
	 * 
	 * @param patients
	 */
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

}