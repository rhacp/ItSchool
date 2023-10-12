package session12_oop_polymorphism.challenges.fitness_center.models;

public class MedicalHistory {

    private boolean hadIMA;
    private boolean hadAVC;
    private boolean isMedicallyFit;

    public boolean isHadIMA() {
        return hadIMA;
    }

    public void setHadIMA(boolean hadIMA) {
        this.hadIMA = hadIMA;
    }

    public boolean isHadAVC() {
        return hadAVC;
    }

    public void setHadAVC(boolean hadAVC) {
        this.hadAVC = hadAVC;
    }

    public boolean isMedicallyFit() {
        return isMedicallyFit;
    }

    public void setMedicallyFit(boolean medicallyFit) {
        isMedicallyFit = medicallyFit;
    }
}
