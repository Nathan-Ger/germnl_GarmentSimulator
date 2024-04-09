package com.example.Factory;

import com.example.GarmentProducts.Pants.Pants;
import com.example.GarmentProducts.Pants.ProfessionalPants;
import com.example.GarmentProducts.Shoes.ProfessionalShoes;
import com.example.GarmentProducts.Shoes.Shoes;
import com.example.GarmentProducts.Tops.ProfessionalTops;
import com.example.GarmentProducts.Tops.Tops;

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
