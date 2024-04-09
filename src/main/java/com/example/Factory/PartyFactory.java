package com.example;

/** PartyFactory implements GarmentFactory
 * @author NathanaelGermain
 * 
 * Takes from Garment factory to create new party pants, shoes and tops.
 */
public class PartyFactory implements GarmentFactory {

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }

    @Override
    public Tops createTops() {
        return new PartyTops();
    }
    
}
