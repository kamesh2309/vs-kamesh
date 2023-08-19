package edu.disease.asn2;

import java.util.UUID;
/**
 * 
 * @author dell
 *
 */
public abstract class Disease {
	private UUID diseaseId;
	private String name;
	/**
	 * 
	 * @return
	 */
	public abstract String[] getExample();
	/**
	 * 
	 * @return
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}
	/**
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

}
/**
 * 
 * @author dell
 *
 */

class InfectiousDisease extends Disease{
	/**
	 * 
	 */
	
	@Override
	public String[] getExample() {
		String[] infectiousDisease={"Influenza","COVID-18","Common cold","HIV"};
		return infectiousDisease; 
	}
	
}
/**
 * 
 * @author dell
 *
 */
class NonInfectiousDisease extends Disease{
	/**
	 * 
	 */
	@Override
	public String[] getExample() {
		String[] nonInfectiousDisease={"Diabetes","Colour blindnes","Heart attack","cancers"};
		return nonInfectiousDisease; 
	}
	
}