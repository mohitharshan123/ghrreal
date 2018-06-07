
package com.example.reubro.ghr.Retrofit.sync;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category3 {

    @SerializedName("Category Name")
    @Expose
    private String categoryName;
    @SerializedName("medical_category_id")
    @Expose
    private Integer medicalCategoryId;
    @SerializedName("Pubertal Status")
    @Expose
    private String pubertalStatus;
    @SerializedName("Clinical Features")
    @Expose
    private String clinicalFeatures;
    @SerializedName("Any Previous Surgeries")
    @Expose
    private String anyPreviousSurgeries;
    @SerializedName("Any Other relevent medical History")
    @Expose
    private String anyOtherReleventMedicalHistory;
    @SerializedName("diagnosis_date")
    @Expose
    private String diagnosisDate;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getMedicalCategoryId() {
        return medicalCategoryId;
    }

    public void setMedicalCategoryId(Integer medicalCategoryId) {
        this.medicalCategoryId = medicalCategoryId;
    }

    public String getPubertalStatus() {
        return pubertalStatus;
    }

    public void setPubertalStatus(String pubertalStatus) {
        this.pubertalStatus = pubertalStatus;
    }

    public String getClinicalFeatures() {
        return clinicalFeatures;
    }

    public void setClinicalFeatures(String clinicalFeatures) {
        this.clinicalFeatures = clinicalFeatures;
    }

    public String getAnyPreviousSurgeries() {
        return anyPreviousSurgeries;
    }

    public void setAnyPreviousSurgeries(String anyPreviousSurgeries) {
        this.anyPreviousSurgeries = anyPreviousSurgeries;
    }

    public String getAnyOtherReleventMedicalHistory() {
        return anyOtherReleventMedicalHistory;
    }

    public void setAnyOtherReleventMedicalHistory(String anyOtherReleventMedicalHistory) {
        this.anyOtherReleventMedicalHistory = anyOtherReleventMedicalHistory;
    }

    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(String diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

}
