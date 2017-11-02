package pro.christianmtr.tesis.ws.services;

import pro.christianmtr.tesis.ws.models.DAOCrimesChicago;
import pro.christianmtr.tesis.ws.models.EntityCrimesChicago;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "CrimesChicago")
public class CrimesChicago {

    @WebMethod(operationName = "allCrimes")
    public List<String[]> allCrimes() {
        DAOCrimesChicago controller = new DAOCrimesChicago();
        List<EntityCrimesChicago> crimes = controller.getAllCrimesChicago();

        List<String[]> finalList = new ArrayList<>();

        for (EntityCrimesChicago value : crimes) {
            String[] array = new String[22];
            array[0] = value.getID();
            array[1] = value.getCase_Number();
            array[2] = value.getDate();
            array[3] = value.getBlock();
            array[4] = value.getIUCR();
            array[5] = value.getPrimary_Type();
            array[6] = value.getDescription();
            array[7] = value.getLocation_Description();
            array[8] = value.getArrest();
            array[9] = value.getDomestic();
            array[10] = value.getBeat();
            array[11] = value.getDistrict();
            array[12] = value.getWard();
            array[13] = value.getCommunity_Area();
            array[14] = value.getFBI_Code();
            array[15] = value.getX_Coordinate();
            array[16] = value.getY_Coordinate();
            array[17] = value.getYear();
            array[18] = value.getUpdated_On();
            array[19] = value.getLatitude();
            array[20] = value.getLongitude();
            array[21] = value.getLocation();
            finalList.add(array);
        }

        return finalList;
    }

    @WebMethod(operationName = "someCrimes")
    public List<String[]> someCrimes(@WebParam(name = "q") String q) {
        DAOCrimesChicago controller = new DAOCrimesChicago();
        List<EntityCrimesChicago> crimes = controller.getSomeCrimesChicago(Integer.parseInt(q));

        List<String[]> finalList = new ArrayList<>();

        for (EntityCrimesChicago value : crimes) {
            String[] array = new String[22];
            array[0] = value.getID();
            array[1] = value.getCase_Number();
            array[2] = value.getDate();
            array[3] = value.getBlock();
            array[4] = value.getIUCR();
            array[5] = value.getPrimary_Type();
            array[6] = value.getDescription();
            array[7] = value.getLocation_Description();
            array[8] = value.getArrest();
            array[9] = value.getDomestic();
            array[10] = value.getBeat();
            array[11] = value.getDistrict();
            array[12] = value.getWard();
            array[13] = value.getCommunity_Area();
            array[14] = value.getFBI_Code();
            array[15] = value.getX_Coordinate();
            array[16] = value.getY_Coordinate();
            array[17] = value.getYear();
            array[18] = value.getUpdated_On();
            array[19] = value.getLatitude();
            array[20] = value.getLongitude();
            array[21] = value.getLocation();
            finalList.add(array);
        }

        return finalList;
    }

    @WebMethod(operationName = "oneCrime")
    public String[] oneCrime(@WebParam(name = "id") String id) {
        DAOCrimesChicago controller = new DAOCrimesChicago();
        EntityCrimesChicago one_crime = controller.getOneCrimeChicago(id);

        String[] array = new String[22];
        array[0] = one_crime.getID();
        array[1] = one_crime.getCase_Number();
        array[2] = one_crime.getDate();
        array[3] = one_crime.getBlock();
        array[4] = one_crime.getIUCR();
        array[5] = one_crime.getPrimary_Type();
        array[6] = one_crime.getDescription();
        array[7] = one_crime.getLocation_Description();
        array[8] = one_crime.getArrest();
        array[9] = one_crime.getDomestic();
        array[10] = one_crime.getBeat();
        array[11] = one_crime.getDistrict();
        array[12] = one_crime.getWard();
        array[13] = one_crime.getCommunity_Area();
        array[14] = one_crime.getFBI_Code();
        array[15] = one_crime.getX_Coordinate();
        array[16] = one_crime.getY_Coordinate();
        array[17] = one_crime.getYear();
        array[18] = one_crime.getUpdated_On();
        array[19] = one_crime.getLatitude();
        array[20] = one_crime.getLongitude();
        array[21] = one_crime.getLocation();

        return array;
    }
}
