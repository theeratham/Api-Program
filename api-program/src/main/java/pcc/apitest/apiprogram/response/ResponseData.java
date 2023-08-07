package pcc.apitest.apiprogram.response;

public class ResponseData {
    private String userId;
    private String tokenId;

    public ResponseData(String userId, String tokenId) {
        this.userId = userId;
        this.tokenId = tokenId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTokenId() {
        return tokenId;
    }
}
