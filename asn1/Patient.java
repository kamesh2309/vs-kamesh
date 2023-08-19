package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;
/**
 * 
 * @author dell
 *
 */
public class Patient {
	private String firstName;
	private String lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;
	UUID patientId;
	int maxDiseases;
	int maxExposures;
	int i = 0,j=0;
	/**
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (0 < maxDiseases && 0 < maxExposures ){
			this.maxDiseases = maxDiseases;
			this.maxExposures = maxExposures;
			exposures = new Exposure[maxExposures];
			diseaseIds =new UUID[maxDiseases];
		}
		else {
			throw new IllegalArgumentException("Kindly enter a number");
		}
	}
	/**
	 * 
	 * @param diseaseId
	 */
	public void addDiseaseId(UUID diseaseId) {
		if (i < maxDiseases) {
			diseaseIds[i++] = diseaseId;
		} else {
			throw new IndexOutOfBoundsException("The memory is full......");
		}

	}
	/**
	 * 
	 * @param exposure
	 */
	public void addExposure(Exposure exposure) {
		if (j < maxExposures) {
			exposures[j++] = exposure;

		} else {
			throw new IndexOutOfBoundsException("The memory is full......");
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return
	 */

	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}
	/**
	 * 
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
	 * 
	 */
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposure=" + Arrays.toString(exposures)
				+ ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId=" + patientId + "]";
	}

}
