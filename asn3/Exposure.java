package edu.disease.asn3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * This is a class called Exposure.
 * It has UUID patientId, LocalDateTime dateTime, String exposureType 
 * as its fields.
 * @author DELL
 */
public class Exposure implements Serializable {
	/**
	 * This is line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	/**
	 * This is a constructor
	 * used to set the patientId.
	 * @param patientId
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}
	
	/**
	 * This is a No-Param Constructor.
	 */
	public Exposure() {

	}

	/**
	 * This method gives patientId.
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This method gives Local dateTime.
	 * @return
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * This method is used to set the Local dateTime.
	 * @param dateTime
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * This method gives exposure type.
	 * @return
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * This method is used to set the Exposure type.
	 * @param exposureType
	 */
	public void setExposureType(String exposureType) {
		if (exposureType.equalsIgnoreCase("D") || exposureType.equalsIgnoreCase("I"))
			this.exposureType = exposureType;
		else
			throw new IllegalArgumentException("Kindly Enter 'D' for Direct Exposure and 'I' for Indirect Exposure ");
	}

	/**
	 * Here we overrided the hashCode method based on the requirement.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
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
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}