package com.lxd.resources;

import com.lxd.model.POItem;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/poitem")
public class POItemResource {
    private List<POItem> poItemList;
    private static String INSERT_OPERATION_RESULT = "result";
    private static String SUCCESS_OPERATION_RESULT = "success";
    public POItemResource(){
        poItemList = new ArrayList<>();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPOItem(POItem poItem){
        Map<String, String> result = new HashMap<>();

        result.put(INSERT_OPERATION_RESULT, SUCCESS_OPERATION_RESULT);
        if (poItem != null){
            if (poItem.getModelName() == null || poItem.getModelName().equals(""))  {
                result.put(INSERT_OPERATION_RESULT, "Model Name has issue");
            } else if (poItem.getUnitPrice() == null || poItem.getUnitPrice() == 0) {
                result.put(INSERT_OPERATION_RESULT, "UnitPrice has issue");
            } else if (poItem.getQuantity() == null || poItem.getQuantity() == 0) {
                result.put(INSERT_OPERATION_RESULT, "Quantity has issue");
            } else if (poItem.getVendorName() == null || poItem.getVendorName().equals("")) {
                result.put(INSERT_OPERATION_RESULT, "VendorName has issue");
            } else if (poItem.getDateStr() == null || poItem.getDateStr().equals("")) {
                result.put(INSERT_OPERATION_RESULT, "Date has issue");
            }
        }

        if (result.get(INSERT_OPERATION_RESULT).equals(SUCCESS_OPERATION_RESULT)){
            this.poItemList.add(poItem);
        }
        return Response.ok(result).type(MediaType.APPLICATION_JSON_TYPE).build();
    }

    @Path("/batch")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPOItems(List<POItem> newPOItems){
        Map<String, String> result = new HashMap<>();
        result.put(INSERT_OPERATION_RESULT, SUCCESS_OPERATION_RESULT);
        for (POItem item : newPOItems){
            if (item != null){
                if (item.getModelName() == null || item.getModelName().equals("")) {
                    result.put(INSERT_OPERATION_RESULT, "Model Name has issue");
                    break;
                }
                if (item.getUnitPrice() == null || item.getUnitPrice() == 0) {
                    result.put(INSERT_OPERATION_RESULT, "UnitPrice has issue");
                    break;
                }
                if (item.getQuantity() == null || item.getQuantity() == 0) {
                    result.put(INSERT_OPERATION_RESULT, "Quantity has issue");
                    break;
                }
                if (item.getVendorName() == null || item.getVendorName().equals("")) {
                    result.put(INSERT_OPERATION_RESULT, "VendorName has issue");
                    break;
                }
                if (item.getDateStr() == null || item.getDateStr().equals("")) {
                    result.put(INSERT_OPERATION_RESULT, "Date has issue");
                    break;
                }
            }
        }
        if (result.get(INSERT_OPERATION_RESULT).equals(SUCCESS_OPERATION_RESULT)){
            this.poItemList.addAll(newPOItems);
        }
        return Response.ok(result).type(MediaType.APPLICATION_JSON_TYPE).build();
    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<POItem> getPOList(){
        return poItemList;
    }
}
