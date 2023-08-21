package edu.disease.asn3;

import java.io.Serializable;
import java.util.UUID;
/**
 * 
 * @author dell
 *This is Abstract class called Disease
 *It has UUID diseaseId ,String Name as its fields.
 */
public abstract class Disease implements Serializable  {
	/**
	 * This a line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private UUID diseaseId;
	private String name;
	/**
	 * This Abstract Method gives Arrays of Example 
	 * @return
	 */
	public abstract String[] getExample();
	/**
	 * This Method gives DiseaseId 
	 * @return
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}
	/**
	 * This Method use to set DiseaseId
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	/**
	 * This method Gives Name of Disease
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * This Method is use to set Name of Disease
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Here we override the HashCode Method based on the Requirements
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	/**
	 * Here we override the toString Method based on the Requirements
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

}
/**
 * This class InfectiousDisease is a Sub class of {@link Disease}
 * @author dell
 *
 */

class InfectiousDisease extends Disease{
	/**
	 *This Method gives Names of infectious Disease
	 */
	
	@Override
	public String[] getExample() {
		String[] infectiousDisease={"Influenza","COVID-18","Common cold","HIV"};
		return infectiousDisease; 
	}
	
}
/**
 * This class Non-InfectiousDisease is a Sub class of {@link Disease}
 * @author dell
 *
 */
class NonInfectiousDisease extends Disease{
	/**
	 * This Method gives Names of Non-infectious Disease
	 */
	@Override
	public String[] getExample() {
		String[] nonInfectiousDisease={"Diabetes","Colour blindnes","Heart attack","cancers"};
		return nonInfectiousDisease; 
	}
	
}