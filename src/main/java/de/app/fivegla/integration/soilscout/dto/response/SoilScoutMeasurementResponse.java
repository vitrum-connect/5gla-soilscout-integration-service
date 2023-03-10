package de.app.fivegla.integration.soilscout.dto.response;

import de.app.fivegla.integration.soilscout.model.SoilScoutData;
import lombok.Getter;
import lombok.Setter;

/**
 * Soil scout sensor data response.
 */
@Getter
@Setter
public class SoilScoutMeasurementResponse {

    private String next;
    private String previous;
    private SoilScoutData[] results;

}
