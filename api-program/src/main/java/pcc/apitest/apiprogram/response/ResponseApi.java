package pcc.apitest.apiprogram.response;

public class ResponseApi {
    private String responseCode;
    private String responseMessage;
    private ResponseData responseData;

    public ResponseApi(String responseCode, String responseMessage, ResponseData responseData) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseData = responseData;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public ResponseData getResponseData() {
        return responseData;
    }
}
