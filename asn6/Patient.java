package edu.disease.asn6;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Exposure;

/**
 * This is class Called Patient THis class Contain String firstName,lastName
 * Arrays Exposure,diseaseIds int maxDiseases,maxExposures,as its fields;
 * 
 * @author dell
 *
 */
public class Patient implements Comparable<Patient>, Serializable {
	/**
	 * This a line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private List<Exposure> exposures;
	private List<UUID> diseaseIds;
	private UUID patientId;

	/**
	 * This constructor is use to initialized exposures & diseaseIds Arrays If the
	 * Supplied values are unable to initialized the arrays it will Throws an
	 * {@link IllegalArgumentException}
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 */

	public Patient() {

		exposures = new LinkedList<>();
		diseaseIds = new LinkedList<>();

	}

	/**
	 * This Method is use to Add the Disease in diseaseId If the Array Memory is
	 * full it will Throw an {@link IndexOutOfBoundsException}
	 * 
	 * @param diseaseId
	 */
	public void addDiseaseId(UUID diseaseId) {

		diseaseIds.add(diseaseId);

	}

	/**
	 * This method gives patientId
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This is method is use to set Value for patientId
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * This Method is use to Add the Exposure in exposure If the Array Memory is
	 * full it will Throw an {@link IndexOutOfBoundsException}
	 * 
	 * @param exposure
	 */
	public void addExposure(Exposure exposure) {
		exposures.add(exposure)	;
	}

		

	public List<Exposure> getExposures() {
		return exposures;
	}

	public void setExposures(List<Exposure> exposures) {
		this.exposures = exposures;
	}

	public List<UUID> getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(List<UUID> diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	/**
	 * This Method gives Patient First Name
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This Method is use to Set Patient First Name
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This Method gives Patient Last Name
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This Method is use to Set Patient Last Name
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Here we override the HashCode Method based on the Requirements
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Here we override the Equals Method based on the Requirements
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
	 * Here we override the HashCode Method based on the Requirements
	 */

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures=" + exposures
				+ ", diseaseIds=" + diseaseIds + ", patientId=" + patientId + "]";
	}

	/**
	 * Here we override the compareTo Method based on the Requirements
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
