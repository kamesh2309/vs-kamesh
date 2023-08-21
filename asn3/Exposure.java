package edu.disease.asn3;

import java.util.UUID;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * This is class called Exposure This class Contain String Exposure UUID
 * PatientId & LocalDateTime dateTime as its fields
 * 
 * @author dell
 *
 */
public class Exposure implements Serializable {
	/**
	 * This a line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private String exposertype;
	private UUID patientId;
	private LocalDateTime dateTime;

	/**
	 * This is no Parameter Constructor
	 */
	public Exposure() {

	}

	/**
	 * This constructor is use to set PatientID
	 * 
	 * @param exposertype
	 * @param dateTime
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * This method gives Exposer Type
	 * 
	 * @return
	 */
	public String getExposertype() {
		return exposertype;
	}

	/**
	 * This method is use to set Exposer Type
	 * 
	 * @param exposertype
	 */
	public void setExposertype(String exposertype) {

		if ("D".equalsIgnoreCase(exposertype) || "I".equalsIgnoreCase(exposertype)) {
			this.exposertype = exposertype;
		} else {

			throw new IllegalArgumentException("Kindly Enter 'D' for Direct Exposure and 'I' for Indirect Exposure");
		}
	}

	/**
	 * This Method Give local Date and time
	 * 
	 * @return
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * This Method use to set Local Date and Time
	 * 
	 * @param dateTime
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * This Method gives get PatientId
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
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
	 * Here we override the HashCode Method based on the Requirements
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
	 * Here we override the toString Method based on the Requirements
	 * 
	 */
	@Override
	public String toString() {
		return "Exposure [exposertype=" + exposertype + ", patientId=" + patientId + ", dateTime=" + dateTime + "]";
	}

}
