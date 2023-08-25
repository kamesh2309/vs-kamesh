package edu.disease.asn6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.NonInfectiousDisease;
import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.InfectiousDisease;

/**
 * This class called DiseaseControlManagerImpl Implemented By
 * {@link DiseaseControlManagerImpl} It has Arrays diseases,patients & int
 * maxDiseases, MaxPatients has a field
 * 
 * @author dell
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private List<Disease> diseases;
	private List<Patient> patients;
	
	public DiseaseControlManagerImpl() {
		diseases = new LinkedList<Disease>();
		patients = new LinkedList<Patient>();
	}

	/** 
	 * This Method is use to Add the Disease 
	 * If the Array Memory is Full it throw an {@link IllegalStateException}
	 */
	@Override
	public List<Disease> addDisease(String name, boolean infectious) {

		
		
			if (infectious) {
				diseases.add(new InfectiousDisease());
				return diseases;
			} 
			else
			{
				diseases.add(new NonInfectiousDisease());
				return diseases;
			}
		
	}

	/**
	 * This Method is use Give Disease If the Supplied diseaseId is Match it give
	 * Disease name else <code>null
	 */
	@Override
	public Disease getDisease(UUID diseaseId) {
		for(Disease disease:diseases) {
			if(disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	/**
	 * This Method is use to Add the Patient If the Array Memory is Full it throw an
	 * {@link IllegalStateException}
	 */
	@Override
	public List<Patient> addPatient(String firstName, String lastName) {
		
		patients=new LinkedList<Patient>();
		Patient patient = new Patient();
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		return patients;
		
	}
		

	/**
	 * * This Method is use Give patient If the Supplied patientId is Match it give
	 * Disease name else <code>null
	 */
	@Override
	public Patient getPatient(UUID patientId) {
		for(Patient patient:patients) {
			if(patient.getPatientId().equals(patientId)) {
				return patient;
			}
			
			
		}
		return null;
	}

	/**
	 * This Method is use to Add the Disease to the patient If disease (or) patient
	 * is <code>null it will Throw {@link IllegalArgumentException}
	 */
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Disease disease = getDisease(diseaseId);
		if (disease == null) {
			throw new IllegalArgumentException("Invalid Disease Id...:");
		}
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid patientId Id...:");
		}
		patient.addDiseaseId(diseaseId);
	}

	/**
	 * This Method is use to Add the Disease to the patient If disease (or) patient
	 * is <code>null it will Throw {@link IllegalArgumentException}
	 */
	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {

		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid patientId Id...:");
		}
		patient.addExposure(exposure);

	}

	/**
	 * This Method gives Arrays of Diseases
	 */
	@Override
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * This Method gives Arrays of Patient
	 */
	@Override
	public List<Patient> getPatients() {
		return patients;
	}

}
