package com.example;

/** CasualFactory implements GarmentFactory
 * @author NathanaelGermain
 * 
 * Takes from Garment factory to create new casual pants, shoes and tops.
 */
public class CasualFactory implements GarmentFactory {

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }

    @Override
    public Tops createTops() {
        return new CasualTops();
    }
    
}
