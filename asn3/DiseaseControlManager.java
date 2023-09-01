package edu.disease.asn3;

import java.util.UUID;

/**
 * This is an interface called DiseaseControlManager.
 * 
 * @author DELL
 *
 */
public interface DiseaseControlManager {
	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public Disease addDisease(String name, boolean infectious);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param diseaseId
	 * @return
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param maxDiseases
	 * @param maxExposures
	 * @return
	 */
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @return
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public void addExposuretoPatient(UUID patientId, Exposure exposure);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @return
	 */
	public Disease[] getDiseases();

	/**
	 * This is abstract method implemented in {@link DiseaseControlManagerImpl}.
	 * 
	 * @return
	 */
	public Patient[] getPatients();
}