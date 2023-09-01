package edu.disease.asn3;

import java.util.UUID;


/**
 * This is an implementation class of interface{@link DiseaseControlManager} called DiseaseControlManagerImpl.
 * It has Disease[] diseases, Patient[] patients,
 * int maxDiseases, macPatients as its fields.
 * @author DELL
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;
	int maxDiseases, maxPatients;
	int index = 0, index1 = 0;

	/**
	 * This is a constructor.
	 * which is used to set the maxDiseases & maxPatients
	 * along with initialize the array of disease & patients.
	 * If the supplied values not suppose to initialize the array, 
	 * It will throw the {@link IllegalArgumentException} with appropriate message.
	 * @param maxDiseases
	 * @param maxPatients
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (0 < maxDiseases && 0 < maxPatients) {
			this.maxDiseases = maxDiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[maxPatients];
		} else {
			throw new IllegalArgumentException("Enter a number!!");
		}
	}
	
	/**
	 * This method is used to add the diseases in the Disease[] array.
	 * If it exceeds maxDisease, it will throw {@link IllegalStateException} with appropriate message.
	 */
	@Override
	public Disease addDisease(String name, boolean infectious) {
		Disease disease;
		if (index < maxDiseases) {
			if (infectious) {
				disease = new InfectiousDisease();
				disease.setName(name);
				disease.setDiseaseId(UUID.randomUUID());
				return diseases[index++] = disease;
			} else {
				disease = new NonInfectiousDisease();
				disease.setName(name);
				disease.setDiseaseId(UUID.randomUUID());
				return diseases[index++] = new NonInfectiousDisease();
			}
		} else {
			throw new IllegalStateException("No more Disease can be Added !");
		}
	}

	/**
	 * This method gives Disease, if the supplied diseaseId is matched,
	 * else it return <code>null.
	 */
	@Override
	public Disease getDisease(UUID diseaseId) {
		for (int i = 0; i < maxDiseases; i++) {
			if ((diseases[i].getDiseaseId()).equals(diseaseId)) {
				return diseases[i];
			}
		}
		return null;
	}

	/**
	 * This method is used to add the patients in the Patient[] array.
	 * If it exceeds maxDisease, it will throw {@link IllegalStateException} with appropriate message.
	 */
	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (index1 < maxPatients) {
			patients[index1] = new Patient(maxDiseases, maxExposures);
			patients[index1].setFirstName(firstName);
			patients[index1].setLastName(lastName);
			return patients[index1++];
		} else {
			throw new IllegalStateException("No more Patient can be Added ! ");
		}
	}

	/**
	 * This method gives Patient, if the supplied patientId is matched,
	 * else it return <code>null.
	 */
	@Override
	public Patient getPatient(UUID patientId) {
		for (int i = 0; i < maxPatients; i++) {
			if ((patients[i].getPatientId()).equals(patientId)) {
				return patients[i];
			}
		}
		return null;
	}

	/**
	 * This method is used to add disease to the patient.
	 * If the patient or disease is <code>null, it will throw {@link IllegalArgumentException} with appropriate message. 
	 */
	@Override
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		Disease disease = getDisease(diseaseId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		if (disease == null) {
			throw new IllegalArgumentException("Invalid Disease Id !");
		}
		patient.addDiseaseId(disease.getDiseaseId());
	}

	/**
	 * This method is used to add exposure to the patient.
	 * If the patient or disease is <code>null, it will throw {@link IllegalArgumentException} with appropriate message.
	 */
	@Override
	public void addExposuretoPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		patient.addExposure(exposure);
	}

	/**
	 * This method gives array of diseases.
	 */
	@Override
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * This method gives array of patients.
	 */
	@Override
	public Patient[] getPatients() {
		return patients;
	}
}