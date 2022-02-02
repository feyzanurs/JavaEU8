package day11_SwitchStatements;

public class Browsers {
    public static void main(String[] args) {
        String browserName="Chrome";
        String result= "";
        boolean validation= browserName=="Chrome"||browserName=="FireFox"|| browserName=="Opera"||browserName=="Safari"
                ||browserName=="Edge";
        System.out.println(result);
        if (validation){
            if (browserName=="Chrome"){
                result="Chrome browser is selected";
            }else if (browserName=="FireFox"){
                result="FireFox browser is selected";
            }else if (browserName=="Opera") {
                result = "Opera browser is selected";
            }else if (browserName=="Safari") {
                result = "Safari browser is selected";
            }else{
                result="Edge browser is selected";
            }
        }else{
            result="invalid browser name";
        }
        System.out.println(result);
    }
}
