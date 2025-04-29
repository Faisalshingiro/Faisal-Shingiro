package case_study.Q1;
import java.util.Scanner;

abstract class ConstructionMaterial {
    protected String contractorId;
    protected String contractorName;
    protected double materialQuantity;
    protected double materialBalance;

    public ConstructionMaterial(String contractorId, String contractorName, double materialQuantity) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialQuantity = materialQuantity;
        this.materialBalance = 0;
    }

    public abstract void receiveMaterial();
    public abstract void useMaterial();
    public abstract void estimateCost();
}
