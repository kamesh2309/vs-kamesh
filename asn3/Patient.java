package edu.disease.asn3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

/**
 * This is a class called Patient. It has String firstName, lastName, Exposure[]
 * exposures array, UUID[] diseasseIds array, UUID patientId, int maxDiseases,
 * maxExposures as its fields.
 * 
 * @author DELL
 *
 */
public class Patient implements Comparable<Patient>, Serializable {
	/**
	 * This is line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private String firstName, lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds; 
	private UUID patientId;
	int maxDiseases, maxExposures;
	int index = 0, index1 = 0;

	/**
	 * This is a constructor. which is used to set the maxDiseases & maxExposures
	 * along with initialize the array of diseaseIds & exposures. If the supplied
	 * values not suppose to initialize the array, It will throw the
	 * {@link IllegalArgumentException} with appropriate message.
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (0 < maxDiseases && 0 < maxExposures) {
			this.maxDiseases = maxDiseases;
			this.maxExposures = maxExposures;
			diseaseIds = new UUID[maxDiseases];
			exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException("Enter a number!!");
		}
	}

	/**
	 * This method is used to add the diseases in the Disease[] array. If it exceeds
	 * maxDisease, it will throw {@link IndexOutOfBoundsException} with appropriate
	 * message.
	 * 
	 * @param diseaseId
	 */
	public void addDiseaseId(UUID diseaseId) {
		if (index < maxDiseases)
			diseaseIds[index++] = diseaseId;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}

	/**
	 * This method is used to add the exposures in the Exposure[] array. If it
	 * exceeds maxExposure, it will throw {@link IndexOutOfBoundsException} with
	 * appropriate message.
	 * 
	 * @param exposure
	 */
	public void addExposure(Exposure exposure) {
		if (index1 < maxExposures)
			exposures[index1++] = exposure;
		else
			throw new IndexOutOfBoundsException("Memory Full !!!");

	}

	/**
	 * This method gives Patient's firstName.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method is use to set the Patient's firstName.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method gives Patient's lastName.
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method is use to set the Patient's lastName.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This method gives patientId.
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This method is used to set the patient's Id.
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}
	

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}
	/**
	 * Here we overrided the hashCode method based on the requirement.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Here we overrided the equals method based on the requirement.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * Here we overrided the toString method based on the requirement.
	 */
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId="
				+ patientId + "]";
	}

	/**
	 * Here we overrided the compareTo method based on the requirement.
	 */
	@Override
	public int compareTo(Patient o) {
		if (o.lastName.compareToIgnoreCase(this.lastName) != 0) {
			return o.lastName.compareToIgnoreCase(this.lastName);
		} else {
			return o.firstName.compareToIgnoreCase(this.firstName);
		}
	}

}