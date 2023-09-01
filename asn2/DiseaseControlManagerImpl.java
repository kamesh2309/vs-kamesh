package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * @author DELL
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;
	private int maxDiseases, maxPatients;
	private int index = 0, index1 = 0;

	/**
	 * 
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
	 * 
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
	 * 
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
	 * 
	 */
	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (index1 < maxPatients) {
			patients[index1] = new Patient(maxDiseases, maxExposures);
			patients[index1].setFirstName(firstName);
			patients[index1].setLastName(lastName);
			patients[index1].setPatientId(UUID.randomUUID());
			return patients[index1++];
		} else {
			throw new IllegalStateException("No more Patient can be Added ! ");
		}
	}
 
	/**
	 * 
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
	 * 
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
	 * 
	 */
	@Override
	public void addExposuretoPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		patient.addExposure(exposure);
	}

}