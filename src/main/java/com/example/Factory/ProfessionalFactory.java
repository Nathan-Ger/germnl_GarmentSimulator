package com.example;

/** ProfessionalFactory implements GarmentFactory
 * @author NathanaelGermain
 * 
 * Takes from Garment factory to create new professional pants, shoes and tops.
 */
public class ProfessionalFactory implements GarmentFactory {

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }

    @Override
    public Tops createTops() {
        return new ProfessionalTops();
    }

    
    
}
