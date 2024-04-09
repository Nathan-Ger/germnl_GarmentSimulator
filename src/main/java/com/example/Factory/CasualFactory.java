package com.example.Factory;

import com.example.GarmentProducts.Pants.CasualPants;
import com.example.GarmentProducts.Pants.Pants;
import com.example.GarmentProducts.Shoes.CasualShoes;
import com.example.GarmentProducts.Shoes.Shoes;
import com.example.GarmentProducts.Tops.CasualTops;
import com.example.GarmentProducts.Tops.Tops;

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
