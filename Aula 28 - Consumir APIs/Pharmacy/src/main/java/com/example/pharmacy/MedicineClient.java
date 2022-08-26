package com.example.pharmacy;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

// This class communicates with other back-end (service function)
public class MedicineClient {
    /** Methods **/
    public Medicine save(Medicine medicine) {
        HttpResponse<String> response = null;
        Medicine medicineModel = null;

        try {
            response = Unirest.post("http://localhost:8080/medicines/save")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(medicine)).asString();
            medicineModel = JsonUtil.objectFromString(Medicine.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicineModel;
    }

    public Medicine findById(Integer id) {
        HttpResponse<String> response = null;
        Medicine medicineModel = null;

        try {
            response = Unirest.get("http://localhost:8080/medicines/" + id).asString();
            medicineModel = JsonUtil.objectFromString(Medicine.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicineModel;
    }

    public Medicine update(Medicine medicine) {
        HttpResponse<String> response = null;
        Medicine medicineModel = null;

        try {
            response = Unirest.put("http://localhost:8080/medicines/update")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(medicine)).asString();
            medicineModel = JsonUtil.objectFromString(Medicine.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicineModel;
    }

    public String delete(Integer id) {
        HttpResponse<String> response = null;
        Medicine medicineModel = null;

        try {
            response = Unirest.delete("http://localhost:8080/medicines/" + id).asString();
            medicineModel = JsonUtil.objectFromString(Medicine.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (!response.equals(null)) ? String.valueOf(response.getStatus()) : null;
    }
}
