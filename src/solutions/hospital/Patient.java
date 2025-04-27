package solutions.hospital;

import static solutions.hospital.HospitalActionStatus.SUCCESS;
import static solutions.hospital.HospitalActionStatus.TREATMENT_EXIST;
import static solutions.hospital.Utils.isExist;
import static solutions.hospital.Utils.resizeArr;

public class Patient {
    private final String name;
    private final String idNumber;
    private Treatment[] treatments;
    private int numOfTreatments;

    public Patient(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.treatments = new Treatment[0];
    }

    public HospitalActionStatus addTreatment(Treatment treatment) {
        if (isExist(treatments, numOfTreatments, treatment)) {
            return TREATMENT_EXIST;
        }
        if (treatments.length == numOfTreatments) {
            treatments = (Treatment[]) resizeArr(treatments);
        }
        treatments[numOfTreatments++] = treatment;
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idNumber).append(", ").append(name).append("\nTreatments\n");
        for (int i = 0; i < numOfTreatments; i++) {
            sb.append(treatments[i]).append("\n");
        }
        return sb.toString();
    }

}
