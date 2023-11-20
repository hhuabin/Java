package com.boot.springweb.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bin
 * @date 2023-06-08-15:46
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseRequest {

    private String version;

    private String timestamp;

    private String charset;

    private String req_source;

    private String token;

    private String system;

    private String requestSerial;

    @Override
    public String toString() {
        return "BaseRequest{" +
                "version='" + version + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", charset='" + charset + '\'' +
                ", req_source='" + req_source + '\'' +
                ", token='" + token + '\'' +
                ", system='" + system + '\'' +
                ", requestSerial='" + requestSerial + '\'' +
                '}';
    }
}
