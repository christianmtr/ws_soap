package pro.christianmtr.tesis.ws.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOCrimesChicago {
    public List<EntityCrimesChicago> getAllCrimesChicago() {
        List<EntityCrimesChicago> list = null;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = Connector.getConexion();
            String sql = "SELECT " +
                    "\"ID\", " +
                    "\"Case_Number\", " +
                    "\"Date\", \"Block\", " +
                    "\"IUCR\", \"Primary_Type\", " +
                    "\"Description\", " +
                    "\"Location_Description\", " +
                    "\"Arrest\", \"Domestic\", " +
                    "\"Beat\", " +
                    "\"District\", " +
                    "\"Ward\", " +
                    "\"Community_Area\", " +
                    "\"FBI_Code\", " +
                    "\"X_Coordinate\", " +
                    "\"Y_Coordinate\", " +
                    "\"Year\", " +
                    "\"Updated_On\", " +
                    "\"Latitude\", " +
                    "\"Longitude\", " +
                    "\"Location\" " +
                    "FROM crimes_chicago;";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            list = new ArrayList<>();
            EntityCrimesChicago ecc = null;

            while (rs.next()) {
                ecc = new EntityCrimesChicago();
                ecc.setID(rs.getString("ID"));
                ecc.setCase_Number(rs.getString("Case_Number"));
                ecc.setDate(rs.getString("Date"));
                ecc.setBlock(rs.getString("Block"));
                ecc.setIUCR(rs.getString("IUCR"));
                ecc.setPrimary_Type(rs.getString("Primary_Type"));
                ecc.setDescription(rs.getString("Description"));
                ecc.setLocation_Description(rs.getString("Location_Description"));
                ecc.setArrest(rs.getString("Arrest"));
                ecc.setDomestic(rs.getString("Domestic"));
                ecc.setBeat(rs.getString("Beat"));
                ecc.setDistrict(rs.getString("District"));
                ecc.setWard(rs.getString("Ward"));
                ecc.setCommunity_Area(rs.getString("Community_Area"));
                ecc.setFBI_Code(rs.getString("FBI_Code"));
                ecc.setX_Coordinate(rs.getString("X_Coordinate"));
                ecc.setY_Coordinate(rs.getString("Y_Coordinate"));
                ecc.setYear(rs.getString("Year"));
                ecc.setUpdated_On(rs.getString("Updated_On"));
                ecc.setLatitude(rs.getString("Latitude"));
                ecc.setLongitude(rs.getString("Longitude"));
                ecc.setLocation(rs.getString("Location"));
            }

            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return list;
    }

    public List<EntityCrimesChicago> getSomeCrimesChicago(int quantity) {
        List<EntityCrimesChicago> list = null;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = Connector.getConexion();
            String sql = "SELECT " +
                    "\"ID\", " +
                    "\"Case_Number\", " +
                    "\"Date\", \"Block\", " +
                    "\"IUCR\", \"Primary_Type\", " +
                    "\"Description\", " +
                    "\"Location_Description\", " +
                    "\"Arrest\", \"Domestic\", " +
                    "\"Beat\", " +
                    "\"District\", " +
                    "\"Ward\", " +
                    "\"Community_Area\", " +
                    "\"FBI_Code\", " +
                    "\"X_Coordinate\", " +
                    "\"Y_Coordinate\", " +
                    "\"Year\", " +
                    "\"Updated_On\", " +
                    "\"Latitude\", " +
                    "\"Longitude\", " +
                    "\"Location\" " +
                    "FROM crimes_chicago " +
                    "LIMIT " + quantity + ";";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            list = new ArrayList<>();
            EntityCrimesChicago ecc = null;

            while (rs.next()) {
                ecc = new EntityCrimesChicago();
                ecc.setID(rs.getString("ID"));
                ecc.setCase_Number(rs.getString("Case_Number"));
                ecc.setDate(rs.getString("Date"));
                ecc.setBlock(rs.getString("Block"));
                ecc.setIUCR(rs.getString("IUCR"));
                ecc.setPrimary_Type(rs.getString("Primary_Type"));
                ecc.setDescription(rs.getString("Description"));
                ecc.setLocation_Description(rs.getString("Location_Description"));
                ecc.setArrest(rs.getString("Arrest"));
                ecc.setDomestic(rs.getString("Domestic"));
                ecc.setBeat(rs.getString("Beat"));
                ecc.setDistrict(rs.getString("District"));
                ecc.setWard(rs.getString("Ward"));
                ecc.setCommunity_Area(rs.getString("Community_Area"));
                ecc.setFBI_Code(rs.getString("FBI_Code"));
                ecc.setX_Coordinate(rs.getString("X_Coordinate"));
                ecc.setY_Coordinate(rs.getString("Y_Coordinate"));
                ecc.setYear(rs.getString("Year"));
                ecc.setUpdated_On(rs.getString("Updated_On"));
                ecc.setLatitude(rs.getString("Latitude"));
                ecc.setLongitude(rs.getString("Longitude"));
                ecc.setLocation(rs.getString("Location"));
            }

            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return list;
    }


}
