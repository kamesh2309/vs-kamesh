package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;
/**
 * This class called DiseaseControlManagerImpl Implemented By {@link DiseaseControlManagerImpl}
 * It has Arrays diseases,patients & int maxDiseases, MaxPatients has a field
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
	 * This  constructor is use to initialized Patients & diseases Arrays
	 * If the Supplied values are unable to initialized the arrays it will
	 * Throws an {@link IllegalArgumentException}
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
	 * This Method is use to Add the Disease 
	 * If the Array Memory is Full it throw an {@link IllegalStateException}
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
	 * This Method is use Give Disease If the Supplied diseaseId is Match it give Disease name else <code>null
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
	 *  This Method is use to Add the Patient 
	 * If the Array Memory is Full it throw an {@link IllegalStateException}
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
	 *  * This Method is use Give patient If the Supplied patientId is Match it give Disease name else <code>null
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
	 * This Method is use to Add the Disease to the patient 
	 * If disease (or) patient is <code>null it will Throw {@link IllegalArgumentException} 
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
	 * This Method is use to Add the Disease to the patient 
	 * If disease (or) patient is <code>null it will Throw {@link IllegalArgumentException} 	
	 */
	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		
		Patient patient=getPatient(patientId);
		if(patient==null) {
			throw new IllegalArgumentException("Invalid patientId Id...:");
		}
		patient.addExposure(exposure);

	}

	/**
	 * This Method gives Arrays of Diseases
	 */
	@Override
	public Disease[] getDiseases() {
		return diseases;
	}
	/**
	 * This Method gives Arrays of Patient
	 */
	@Override
	public Patient[] getPatients() {
		return patients;
	}

}
