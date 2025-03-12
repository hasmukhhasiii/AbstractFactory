package org.example.AbstractFactory;

// Concrete Factory for Name Search
class NameSearchFactory implements StudentSearchAbstractFactory {
    @Override
    public StudentSearch createSearchMethod() {
        return new SearchByName();
    }
}