package day11_SwitchStatements;

public class Task_HTTP {
    public static void main(String[] args) {
        int statusCode=404;
        String result= "";

        switch (statusCode){
            case 200:
                result="OK";
            break;
            case 201:
                result="Created";
            break;
            case 202:
                result="Accepted";
            break;
            case 301:
                result="Moved Permanently";
            break;
            case 303:
                result="See Other";
            break;
            case 304:
                result="Not Modified";
            break;
            case 307:
                result="Temporary Redirect";
            break;
            case 400:
                result="Bad request";
            break;
            case 401:
                result="Unauthorized";
            break;
            case 403:
                result="Forbidden";
            break;
            case 404:
                result="Not found";
            break;
            case 410:
                result="Gone";
            break;
            case 500:
                result="Internal Server Error";
            break;
            case 503:
                result="Service Unavailable";
            break;
            default:
                result="Status Code is invalid";
        }
        System.out.println(result);
    }
}
/*
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
 */