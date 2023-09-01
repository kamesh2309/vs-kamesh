package edu.disease.asn3;

import java.io.Serializable;
import java.util.UUID;

/**
 * This is a abstract class called Disease. It has UUID diseaseId, String name
 * as its fields.
 * 
 * @author DELL
 *
 */
abstract public class Disease implements Serializable {
	/**
	 * This is line of code often found in Java classes that implement the
	 * {@link Serializable} interface. This line is used to assign a version number
	 * (serialVersionUID) to the class to indicate its serialized form's
	 * compatibility with different versions of the class.
	 */
	private static final long serialVersionUID = 1L;
	private UUID diseaseId;
	private String name;

	/**
	 * This method gives diseaseId.
	 * @return
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * This method is used to set the diseaseId.
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * This method gives name of the Disease.
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is used to set the name of the Disease.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This is abstract method, it gives array of Example.
	 * @return
	 */
	public abstract String[] getExamples();

	/**
	 * Here we overrided the hashCode method based on the requirement.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}

	/**
	 * Here we overrided the toString method based on the requirement.
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

}
