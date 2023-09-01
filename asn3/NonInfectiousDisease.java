package edu.disease.asn3;

/**
 * This is a class NonInfectiousDisease, sub-class of {@link Disease}.
 * 
 * @author DELL
 *
 */
public class NonInfectiousDisease extends Disease {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method gives some names of Non-Infectious disease.
	 */
	@Override
	public String[] getExamples() {
		String[] nonInfectiousDisease = { "Heart Disease", "Cancer", " Alzheimer's disease", "Diabetes" };
		return nonInfectiousDisease;
	}
}