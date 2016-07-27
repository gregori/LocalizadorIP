/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.localizadorip;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 *
 * @author rodrigo
 */
public class LocalizadorIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Você deve passar um endereço IP!");
        } else {
            String ipAddress = args[0];
            GeoIPService ipService = new GeoIPService();
            // Chamadas para o Webservice
            GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
            GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
            System.out.println(geoIP.getCountryName());
        }
    }
    
}
