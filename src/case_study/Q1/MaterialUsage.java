package case_study.Q1;

class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double currentBalance) {
        super(contractorId, contractorName, materialQuantity);
        this.materialBalance = currentBalance;
    }

    @Override

    public void useMaterial() {
        if (materialBalance - materialQuantity >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("Used " + materialQuantity + " tons. Remaining: " + materialBalance);
        } else {
            System.out.println("Error: Not enough material. Balance must remain at least 2 tons.");
        }
    }

    @Override
    public void receiveMaterial() {}
    @Override
    public void estimateCost() {}
}