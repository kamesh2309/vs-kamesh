package edu.disease.asn6;

import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;


/**
 * This is an Interface Called Disease Control Manager
 * 
 * @author dell
 *
 */
public interface DiseaseControlManager {
	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public List<Disease> addDisease(String name, boolean infectious);

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
	 * @return
	 */
	public List<Patient> addPatient(String firstName, String lastName);

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
	public List<Disease> getDiseases();

	/**
	 * This Abstract Method implemented in {@link DiseaseControlManager}
	 * 
	 * @return
	 */
	public List<Patient> getPatients();

}
