package khoapham.ptp.phamtanphat.oop;

public class RequestHttp {
    private String url;
    private static RequestHttp requestHttp = null;
    private RequestHttp(String url){
        this.url = url;
    }
    public static RequestHttp getInstance(String url){
        if (requestHttp == null){
            requestHttp = new RequestHttp(url);
        }
        return requestHttp;
    }

    public String getUrl() {
        return url;
    }
}
