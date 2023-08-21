package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * This is an Interface Called Disease Control Manager
 * 
 * @author dell
 *
 */
interface DiseaseControlManager {
	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public Disease addDisease(String name, boolean infectious);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param diseaseId
	 * @return
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param firstName
	 * @param lastName
	 * @param maxDiseases
	 * @param maxExposures
	 * @return
	 */
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param patientId
	 * @return
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public void addExposureToPatient(UUID patientId, Exposure exposure);

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @return
	 */
	public Disease[] getDiseases();

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @return
	 */
	public Patient[] getPatients();

}
