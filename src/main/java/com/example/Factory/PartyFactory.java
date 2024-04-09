package com.example.Factory;

import com.example.GarmentProducts.Pants.Pants;
import com.example.GarmentProducts.Pants.PartyPants;
import com.example.GarmentProducts.Shoes.PartyShoes;
import com.example.GarmentProducts.Shoes.Shoes;
import com.example.GarmentProducts.Tops.PartyTops;
import com.example.GarmentProducts.Tops.Tops;

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
