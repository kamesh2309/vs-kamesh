package edu.disease.asn3;

/**
 * This is a class InfectiousDisease, sub-class of {@link Disease}.
 * 
 * @author DELL
 *
 */
public class InfectiousDisease extends Disease {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method gives some names of Infectious disease.
	 */
	@Override
	public String[] getExamples() {
		String[] infectiousDisease = { "Influenza (flu)", "Chickenpox", "HIV/AIDS", "Diphtheria" };
		return infectiousDisease;
	}
}