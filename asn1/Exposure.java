package edu.disease.asn1;

import java.util.UUID;
import java.time.LocalDateTime;
/**
 * 
 * @author dell
 *
 */
public class Exposure {
	private String exposertype;
	private UUID patientId;
	private LocalDateTime dateTime;
/**
 * 
 */
	public Exposure() {

	}
	/**
	 * 
	 * @param exposertype
	 * @param dateTime
	 */
	public Exposure(String exposertype, LocalDateTime dateTime) {
		this.exposertype = exposertype;
		this.dateTime = dateTime;
	}
	/**
	 * 
	 * @return
	 */
	public String getExposertype() {
		return exposertype;
	}
	/**
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
	 * 
	 * @return
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	/**
	 * 
	 * @param dateTime
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
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
	 * 
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
	 * 
	 */
	@Override
	public String toString() {
		return "Exposure [exposertype=" + exposertype + ", patientId=" + patientId + ", dateTime=" + dateTime + "]";
	}

	

}
