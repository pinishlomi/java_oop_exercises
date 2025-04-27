package solutions.hospital;

import static solutions.hospital.HospitalActionStatus.*;
import static solutions.hospital.Utils.isExist;
import static solutions.hospital.Utils.resizeArr;

public class HospitalDepartment {
    private final String name;
    private final int roomCount;
    private Doctor[] doctors;
    private int numOfDoctors;
    private Patient[] patients;
    private int numOfPatients;

    public HospitalDepartment(String name, int roomCount) {
        this.name = name;
        this.roomCount = roomCount;
        this.doctors = new Doctor[0];
        this.patients = new Patient[0];
    }

    public HospitalActionStatus addDoctor(Doctor doctor) {
        if (isExist(doctors, numOfDoctors, doctor)) {
            return DOCTOR_EXIST;
        }
        if (doctors.length == numOfDoctors) {
            doctors = (Doctor[]) resizeArr(doctors);
        }
        doctors[numOfDoctors++] = doctor;
        return SUCCESS;
    }

    public HospitalActionStatus addPatient(Patient patient) {
        if (isExist(patients, numOfPatients, patient)) {
            return PATIENT_EXIST;
        }
        if (patients.length == numOfPatients) {
            patients = (Patient[]) resizeArr(patients);
        }
        patients[numOfPatients++] = patient;
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(name).append(" with ").append(roomCount).append(" rooms\n").append("Doctors:\n");
        for (int i = 0; i < numOfDoctors; i++) {
            sb.append(doctors[i]).append("\n");
        }
        sb.append("Patients:\n");
        for (int i = 0; i < numOfPatients; i++) {
            sb.append(patients[i]).append("\n");
        }
        return sb.toString();
    }


}
