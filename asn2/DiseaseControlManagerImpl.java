package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;
/**
 * 
 * @author dell
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private Disease[] diseases;
	private Patient[] patients;
	int maxDiseases;
	int MaxPatients;
	int i = 0,j=0;
	/**
	 * 
	 * @param maxDiseases
	 * @param MaxPatients
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int MaxPatients) {
		if (0 < maxDiseases && 0 < MaxPatients) {
			this.maxDiseases = maxDiseases;
			this.MaxPatients = MaxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[MaxPatients];
		} else {
			throw new IllegalArgumentException("Kindly enter a number");
		}
	}
	/**
	 * 
	 */
	@Override
	public Disease addDisease(String name, boolean infectious) {

		if (i < maxDiseases)
		{
			if (infectious) {
                   	return diseases[i++] = new InfectiousDisease();
			} else {
				return diseases[i++] = new NonInfectiousDisease();
			}

		}
		else {
			throw new IllegalStateException("no more disease can be added");
		}

		
	}
	/**
	 * 
	 */
	@Override
	public Disease getDisease(UUID diseaseId) {
		 	for (int i = 0; i < diseases.length; i++) {
				if((diseases[i].getDiseaseId()).equals(diseaseId)) {
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
		if(j< MaxPatients) {
			patients[j]=new Patient(maxDiseases, maxExposures);
			patients[j].setFirstName(firstName);
			patients[j].setLastName(lastName);
			return patients[j++];
			
		}
		else
			throw new IllegalStateException("no more Patient can be added");
		
	}
	/**
	 * 
	 */
	@Override
	public Patient getPatient(UUID patientId) {
		for (int i = 0; i < diseases.length; i++) {
			if((patients[i].patientId).equals(patientId)) {
				return patients[i];
			}
		}
	return null;
	}
	/**
	 * 
	 */
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Disease disease= getDisease(diseaseId);
		if(disease==null) {
			throw new IllegalArgumentException("Invalid Disease Id...:");
		}
		Patient patient=getPatient(patientId);
		if(patient==null) {
			throw new IllegalArgumentException("Invalid patientId Id...:");
		}
		patient.addDiseaseId(diseaseId);
}
	
	/**
	 * 
	 */
	@Override
	public void maxExposureToPatient(UUID patientId, Exposure exposure) {
		
		Patient patient=getPatient(patientId);
		if(patient==null) {
			throw new IllegalArgumentException("Invalid patientId Id...:");
		}
		patient.addExposure(exposure);

	}

}
