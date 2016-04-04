
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hospital_emergency_accident",
    "physician_visit_office_well",
    "emergency_services",
    "urgent_care",
    "hospital_emergency_medical",
    "professional_physician_visit_office"
})
public class Services {

    @JsonProperty("hospital_emergency_accident")
    public HospitalEmergencyAccident hospitalEmergencyAccident;
    @JsonProperty("physician_visit_office_well")
    public PhysicianVisitOfficeWell physicianVisitOfficeWell;
    @JsonProperty("emergency_services")
    public EmergencyServices emergencyServices;
    @JsonProperty("urgent_care")
    public UrgentCare urgentCare;
    @JsonProperty("hospital_emergency_medical")
    public HospitalEmergencyMedical hospitalEmergencyMedical;
    @JsonProperty("professional_physician_visit_office")
    public ProfessionalPhysicianVisitOffice professionalPhysicianVisitOffice;

}
