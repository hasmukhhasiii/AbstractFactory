package org.example.AbstractFactory;

// Concrete Factory for Admission Number Search
class AdmissionNumberSearchFactory implements StudentSearchAbstractFactory {
    @Override
    public StudentSearch createSearchMethod() {
        return new SearchByAdmissionNumber();
    }
}
