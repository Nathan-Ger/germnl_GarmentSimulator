package com.example.Factory;

import com.example.GarmentProducts.Pants.Pants;
import com.example.GarmentProducts.Shoes.Shoes;
import com.example.GarmentProducts.Tops.Tops;

/** interface GarmentFactory
 * @author NathanaelGermain
 * 
 * The base level factory item that all factories will inherit from.
 * Allows for very easy addition of new fabric types.
 */
public interface GarmentFactory {
    
    Pants createPants();
    Shoes createShoes();
    Tops createTops();

}
