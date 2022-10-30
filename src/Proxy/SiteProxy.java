package Proxy;

import java.util.HashMap;

public class SiteProxy extends ISite {
    private SimpleSite site;
    private HashMap<String, String> cache = new HashMap<>();

    public SiteProxy(SimpleSite site) {
        this.site = site;
    }

    @Override
    public String getPage(String name) {
        String page = "";
        if (this.cache.get(name) == null) {
            page = this.site.getPage(name);
            this.cache.put(name, page);
        }
        else {
            page = this.cache.get(name) + " returned from cache";
        }
        return page;
    }
}
