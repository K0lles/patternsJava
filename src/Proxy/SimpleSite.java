package Proxy;

public class SimpleSite extends ISite{
    @Override
    public String getPage(String number) {
        return "This is page " + number;
    }
}
