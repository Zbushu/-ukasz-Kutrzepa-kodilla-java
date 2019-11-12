package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"655423574", "John", "Smith"},
            {"683733474", "Ivone", "Novak"},
            {"786634231", "Jessie", "Pinkman"},
            {"686375411", "Walter", "White"},
            {"715647866", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00, 3700.00, 4350.000, 9000.00, 6200.00};

    public String getWorker(int n) {
        if (n>salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

