package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sun.xml.internal.ws.encoding.soap.SerializationException;

/**
 * This is class called DiseaseFileRepository It has a String folderPath has a
 * field
 * 
 * @author dell
 *
 */
public class DiseaseFileRepository {
	String folderPath;

	/**
	 * This Method is {@link Serializes} and Saves the Supplied diseases & patient
	 * Arrays to two Separate Files
	 * 
	 * @param diseases
	 * @param patients
	 * @throws Exception
	 */
	public void save(Disease[] diseases, Patient[] patients) throws Exception {
		FileOutputStream disease = new FileOutputStream(folderPath + "\\disease.dat");
		ObjectOutputStream writeDisease = new ObjectOutputStream(disease);
		writeDisease.writeObject(diseases);

		FileOutputStream patient = new FileOutputStream(folderPath + "\\patient.dat");
		ObjectOutputStream writePatient = new ObjectOutputStream(disease);
		writePatient.writeObject(patients);
	}

	/**
	 * This Method accepts a file path to the folder where the data are
	 * {@link Serializes} It {@link DeSerilalizes} the disease and patient data form
	 * the respective file If the folderPath is null it will show the
	 * {@link IllegalArgumentException}
	 * 
	 * @param folderPath
	 * @return
	 * @throws Exception
	 */
	public DiseaseAndPatient init(String folderPath) throws Exception {
		if (folderPath != null) {
			DiseaseAndPatient dp = new DiseaseAndPatient();
			this.folderPath = folderPath;
			FileInputStream disease = new FileInputStream(folderPath + "\\disease.dat");
			ObjectInputStream writeDisease = new ObjectInputStream(disease);
			dp.setDiseases((Disease[]) writeDisease.readObject());

			FileInputStream patient = new FileInputStream(folderPath + "\\patient.dat");
			ObjectInputStream writepatient = new ObjectInputStream(patient);
			dp.setPatients((Patient[]) writepatient.readObject());

			return dp;
		} else {
			throw new IllegalArgumentException("Ther is know Such kind of Folder");
		}

	}

}
